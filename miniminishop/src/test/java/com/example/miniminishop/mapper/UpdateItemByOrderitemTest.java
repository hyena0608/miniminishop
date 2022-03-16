package com.example.miniminishop.mapper;

import com.example.miniminishop.mapper.vo.ItemVo;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class UpdateItemByOrderitemTest {

    @Autowired
    MiniminishopMapperService mapperService;

    @Test
    public void 주문_시_상품_재고_재설정() throws Exception {
        // given
        long updateItemId = mapperService.updateItemByOrderitem(1, 10);
        ItemVo findItem = mapperService.selectItemById(1);

        // when
        int itemAmount = findItem.getItemAmount();
        // then
        Assertions.assertThat(itemAmount).isEqualTo(90);
    }

}