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
public class InsertOrderHandler extends BaseHandler {

  public InsertOrderResponse execute(CustomUserDetails user, InsertOrderRequest req) {
    InsertOrderResponse res = new InsertOrderResponse();

    final String orderStatus = req.getOrderStatus();
    final long memberId = req.getMemberId();
    final long deliveryId = req.getDeliveryId();

    if(emptyParam(orderStatus) || emptyParam(memberId) || emptyParam(deliveryId)) {
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
