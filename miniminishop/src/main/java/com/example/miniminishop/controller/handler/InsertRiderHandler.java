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
public class InsertRiderHandler extends BaseHandler {

  public InsertRiderResponse execute(CustomUserDetails user, InsertRiderRequest req) {
    InsertRiderResponse res = new InsertRiderResponse();

    final String riderName = req.getRiderName();
    final String riderVehicle = req.getRiderVehicle();

    if(emptyParam(riderName) || emptyParam(riderVehicle)) {
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
