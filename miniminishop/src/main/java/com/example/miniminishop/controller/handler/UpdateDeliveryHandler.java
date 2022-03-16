package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.status.DeliveryStatus;
import com.example.miniminishop.mapper.MiniminishopMapper;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class UpdateDeliveryHandler extends BaseHandler {

  private final MiniminishopMapper mapper;

  public UpdateDeliveryResponse execute(CustomUserDetails user, UpdateDeliveryRequest req) {
    UpdateDeliveryResponse res = new UpdateDeliveryResponse();

    final long deliveryId = req.getDeliveryId();
    final String deliveryStatus = req.getDeliveryStatus();

    if(emptyParam(deliveryId) || emptyParam(deliveryStatus)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      if (deliveryStatus.equals(DeliveryStatus.START.toString()) | deliveryStatus.equals(DeliveryStatus.COMPLETE.toString()) || deliveryStatus.equals(DeliveryStatus.CANCEL.toString())) {
        mapper.updateDelivery(deliveryId, deliveryStatus);
        res.setCode(ResultCode.Success);
        return res;
      } else {
        res.setCode(ResultCode.Failed);
        return res;
      }
    }
    catch(Exception e) {
      log.error(e.toString());
      res.setCode(ResultCode.Failed);
      return res;
    }
  }
}
