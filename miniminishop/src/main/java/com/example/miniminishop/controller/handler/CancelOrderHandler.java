package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.ResultCode;
import com.example.miniminishop.controller.request.CancelOrderRequest;
import com.example.miniminishop.controller.response.CancelOrderResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CancelOrderHandler extends BaseHandler {

  public CancelOrderResponse execute(CancelOrderRequest req) {
    CancelOrderResponse res = new CancelOrderResponse();

    final long order_id = req.getOrder_id();

    if(emptyParam(order_id)) {
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
