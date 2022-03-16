package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.util.Converter;
import com.example.miniminishop.controller.vo.Item;
import com.example.miniminishop.mapper.MiniminishopMapper;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.mapper.vo.ItemVo;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class SelectItemByNameHandler extends BaseHandler {

  private final MiniminishopMapper mapper;

  public SelectItemByNameResponse execute(CustomUserDetails user, SelectItemByNameRequest req) {
    SelectItemByNameResponse res = new SelectItemByNameResponse();

    final String itemName = req.getItemName();

    if(emptyParam(itemName)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {

      List<ItemVo> itemVoList = mapper.selectItemByName(itemName);
      List<Item> itemList = itemVoList.stream().map(o -> Converter.convert(o, Item.class)).collect(Collectors.toList());

      res.setItems(itemList);
      res.setCode(ResultCode.Success);
      return res;
    }
    catch(Exception e) {
      log.error(e.toString());
      res.setCode(ResultCode.Failed);
      return res;
    }
  }
}
