package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.util.Converter;
import com.example.miniminishop.controller.vo.Item;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.mapper.vo.ItemVo;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.IterableMapping;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class SelectItemListHandler extends BaseHandler {

    private final MiniminishopMapperService mapperService;

    public SelectItemListResponse execute(CustomUserDetails user, SelectItemListRequest req) {
        SelectItemListResponse res = new SelectItemListResponse();

        try {
            // code here

            List<ItemVo> itemVoList = mapperService.selectItemList();
            List<Item> result = itemVoList.stream().map(o -> Converter.convert(o, Item.class)).collect(Collectors.toList());

            res.setItems(result);
            res.setCode(ResultCode.Success);
            return res;
        } catch (Exception e) {
            log.error(e.toString());
            res.setCode(ResultCode.Failed);
            return res;
        }
    }
}
