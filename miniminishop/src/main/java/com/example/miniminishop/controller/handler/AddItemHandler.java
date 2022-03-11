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
public class AddItemHandler extends BaseHandler {

  public AddItemResponse execute(CustomUserDetails user, AddItemRequest req) {
    AddItemResponse res = new AddItemResponse();

    final String item_name = req.getItem_name();
    final int item_amount = req.getItem_amount();
    final long item_price = req.getItem_price();

    if(emptyParam(item_name) || emptyParam(item_amount) || emptyParam(item_price)) {
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
