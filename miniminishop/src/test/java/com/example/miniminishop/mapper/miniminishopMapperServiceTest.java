package com.example.miniminishop.mapper;

import com.example.miniminishop.controller.handler.BaseHandler;
import com.example.miniminishop.controller.request.AddMemberRequest;
import com.example.miniminishop.mapper.vo.ItemVo;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class miniminishopMapperServiceTest {

    @Autowired
    miniminishopMapper mapper;

    @Test
    public void 회원_등록() throws Exception {
        // given
        mapper.insertItem("사탕", 100, 2000);

        // when
        long findItemPrice = mapper.selectItem("사탕").getItemPrice();
        log.info("findItemPrice : ", findItemPrice);
        // then
        Assertions.assertThat(findItemPrice).isEqualTo(2000);
    }

}