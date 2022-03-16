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
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class SelectItemByIdHandler extends BaseHandler {

  private final MiniminishopMapperService mapperService;

  public SelectItemByIdResponse execute(CustomUserDetails user, SelectItemByIdRequest req) {
    SelectItemByIdResponse res = new SelectItemByIdResponse();

    final long itemId = req.getItemId();

    if(emptyParam(itemId)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {

      ItemVo itemVo = mapperService.selectItemById(itemId);
      Item findItem = Converter.convert(itemVo, Item.class);

      res.setItem(findItem);
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
