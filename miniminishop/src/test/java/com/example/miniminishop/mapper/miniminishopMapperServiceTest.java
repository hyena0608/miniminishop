package com.example.miniminishop.mapper;

import com.example.miniminishop.controller.status.DeliveryStatus;
import com.example.miniminishop.controller.status.OrderStatus;
import com.example.miniminishop.mapper.vo.OrderitemVo;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MiniminishopMapperServiceTest {

    @Autowired
    MiniminishopMapperService mapperService;

    @Test
    public void 상품_주문_후_주문리스트_확인_및_결제_비용_비교() throws Exception {

        // given
        int memberId = mapperService.insertMember(1, "홍길동", "010-000-000");
        int deliveryId = mapperService.insertDelivery(DeliveryStatus.NOTHING.toString(), memberId);
        int orderId = mapperService.insertOrder(OrderStatus.YET.toString(), memberId, deliveryId);


        // when
        int itemFirstId = mapperService.insertItem("치킨", 100, 20000);
        int itemSecondId = mapperService.insertItem("피자", 70, 25000);
        int itemThirdId = mapperService.insertItem("햄버거", 80, 10000);
        int itemFourthId = mapperService.insertItem("족발", 90, 50000);

        mapperService.insertOrderItem(memberId, itemFirstId, 20000, 2, orderId);
        mapperService.insertOrderItem(memberId, itemSecondId, 25000, 10, orderId);
        mapperService.insertOrderItem(memberId, itemThirdId, 10000, 3, orderId);
        mapperService.insertOrderItem(memberId, itemFourthId, 50000, 4, orderId);

        int totalPrice = 20000 * 2 + 25000 * 10 + 10000 * 3 + 50000 * 4;
        int answer = 0;

        List<OrderitemVo> orderitemList = mapperService.selectOrderitemByOrderId(orderId);
        for (OrderitemVo orderitemVo : orderitemList) {
            answer += orderitemVo.getItemPrice() * orderitemVo.getItemAmount();
        }


        // then
        Assertions.assertThat(totalPrice).isEqualTo(answer);
    }

}