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
public class AddDeliveryHandler extends BaseHandler {

  public AddDeliveryResponse execute(CustomUserDetails user, AddDeliveryRequest req) {
    AddDeliveryResponse res = new AddDeliveryResponse();

    final String deliveryStatus = req.getDeliveryStatus();
    final long memberId = req.getMemberId();

    if(emptyParam(deliveryStatus) || emptyParam(memberId)) {
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
