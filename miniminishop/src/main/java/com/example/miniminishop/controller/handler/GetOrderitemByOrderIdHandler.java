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
public class GetOrderitemByOrderIdHandler extends BaseHandler {

  public GetOrderitemByOrderIdResponse execute(CustomUserDetails user, GetOrderitemByOrderIdRequest req) {
    GetOrderitemByOrderIdResponse res = new GetOrderitemByOrderIdResponse();

    final long orderId = req.getOrderId();

    if(emptyParam(orderId)) {
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
