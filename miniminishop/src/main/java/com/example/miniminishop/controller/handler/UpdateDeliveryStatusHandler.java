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
public class UpdateDeliveryStatusHandler extends BaseHandler {

  public UpdateDeliveryStatusResponse execute(CustomUserDetails user, UpdateDeliveryStatusRequest req) {
    UpdateDeliveryStatusResponse res = new UpdateDeliveryStatusResponse();

    final long delivery_id = req.getDelivery_id();
    final String delivery_status = req.getDelivery_status();

    if(emptyParam(delivery_id) || emptyParam(delivery_status)) {
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
