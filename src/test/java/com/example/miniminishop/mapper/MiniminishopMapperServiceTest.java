//package com.example.miniminishop.mapper;
//
//import com.example.miniminishop.controller.status.DeliveryStatus;
//import com.example.miniminishop.controller.status.OrderStatus;
//import com.example.miniminishop.mapper.vo.OrderitemVo;
//import org.assertj.core.api.Assertions;
//import org.junit.After;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Transactional
//public class MiniminishopMapperServiceTest {
//
//    @Autowired
//    MiniminishopMapperService mapperService;
//
//    @Test
//    public void 상품_주문_후_주문리스트_확인_및_결제_비용_비교() throws Exception {
//
//        // given
//        long memberId = mapperService.insertMember(1, "홍길동", "010-000-000");
//        long deliveryId = mapperService.insertDelivery(DeliveryStatus.YET.toString(), memberId);
//        long orderId = mapperService.insertOrder(OrderStatus.YET.toString(), memberId, deliveryId);
//
//
//        // when
//        /**
//         * 현 테이블과 맞춰야함
//         */
//        long itemFirstId = mapperService.insertItem("치킨", 100, 20000);
//        long itemSecondId = mapperService.insertItem("피자", 70, 20000);
//        long itemThirdId = mapperService.insertItem("햄버거", 80, 20000);
//        long itemFourthId = mapperService.insertItem("족발", 90, 20000);
//
//        mapperService.insertOrderItem(memberId, itemFirstId, 20000, 2, orderId);
//        mapperService.insertOrderItem(memberId, itemSecondId, 25000, 10, orderId);
//        mapperService.insertOrderItem(memberId, itemThirdId, 10000, 3, orderId);
//        mapperService.insertOrderItem(memberId, itemFourthId, 50000, 4, orderId);
//
//        int totalPrice = 20000 * 2 + 20000 * 10 + 20000 * 3 + 20000 * 4;
//        int answer = 0;
//
//        List<OrderitemVo> orderitemList = mapperService.selectOrderitemByOrderId(orderId);
//        for (OrderitemVo orderitemVo : orderitemList) {
//            answer += orderitemVo.getItemPrice() * orderitemVo.getItemAmount();
//        }
//
//
//        // then
//        Assertions.assertThat(totalPrice).isEqualTo(answer);
//    }
//
//}