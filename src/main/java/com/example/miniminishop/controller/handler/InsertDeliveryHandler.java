package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
public class InsertDeliveryHandler extends BaseHandler {


  public InsertDeliveryResponse execute(CustomUserDetails user, InsertDeliveryRequest req) {
    InsertDeliveryResponse res = new InsertDeliveryResponse();

    final String deliveryStatus = req.getDeliveryStatus();
    final long memberId = req.getMemberId();

    if(emptyParam(deliveryStatus) || emptyParam(memberId)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {


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
