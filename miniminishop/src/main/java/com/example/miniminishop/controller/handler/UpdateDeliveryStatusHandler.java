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

    final long deliveryId = req.getDeliveryId();
    final String deliveryStatus = req.getDeliveryStatus();

    if(emptyParam(deliveryId) || emptyParam(deliveryStatus)) {
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
