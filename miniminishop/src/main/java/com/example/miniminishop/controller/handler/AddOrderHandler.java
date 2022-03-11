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
public class AddOrderHandler extends BaseHandler {

  public AddOrderResponse execute(CustomUserDetails user, AddOrderRequest req) {
    AddOrderResponse res = new AddOrderResponse();

    final String order_status = req.getOrder_status();
    final int order_item_amount = req.getOrder_item_amount();
    final long order_item_total_cash = req.getOrder_item_total_cash();
    final long member_id = req.getMember_id();
    final long item_id = req.getItem_id();
    final long delivery_id = req.getDelivery_id();

    if(emptyParam(order_status) || emptyParam(order_item_amount) || emptyParam(order_item_total_cash) || emptyParam(member_id) || emptyParam(item_id) || emptyParam(delivery_id)) {
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
