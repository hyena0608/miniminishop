package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class InsertItemHandler extends BaseHandler {

  private final MiniminishopMapperService mapperService;

  public InsertItemResponse execute(CustomUserDetails user, InsertItemRequest req) {
    InsertItemResponse res = new InsertItemResponse();

    final String itemName = req.getItemName();
    final int itemAmount = req.getItemAmount();
    final long itemPrice = req.getItemPrice();

    if(emptyParam(itemName) || emptyParam(itemAmount) || emptyParam(itemPrice)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {

      mapperService.insertItem(itemName, itemAmount, itemPrice);

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
