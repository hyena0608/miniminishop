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

    final String delivery_status = req.getDelivery_status();
    final long member_id = req.getMember_id();

    if(emptyParam(delivery_status) || emptyParam(member_id)) {
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
