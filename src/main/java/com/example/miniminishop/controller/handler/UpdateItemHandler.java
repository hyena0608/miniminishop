package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
public class UpdateItemHandler extends BaseHandler {

  public UpdateItemResponse execute(CustomUserDetails user, UpdateItemRequest req) {
    UpdateItemResponse res = new UpdateItemResponse();

    final long itemId = req.getItemId();
    final String itemName = req.getItemName();
    final int itemAmount = req.getItemAmount();
    final long itemPrice = req.getItemPrice();

    if(emptyParam(itemId) || emptyParam(itemName) || emptyParam(itemAmount) || emptyParam(itemPrice)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here
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
