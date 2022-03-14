package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.status.DeliveryStatus;
import com.example.miniminishop.controller.status.OrderStatus;
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
public class InsertOrderHandler extends BaseHandler {

  private final MiniminishopMapperService mapperService;

  public InsertOrderResponse execute(CustomUserDetails user, InsertOrderRequest req) {
    InsertOrderResponse res = new InsertOrderResponse();

    final String orderStatus = req.getOrderStatus();
    final long memberId = req.getMemberId();

//    if(emptyParam(orderStatus) || emptyParam(memberId)) {
//      res.setCode(ResultCode.BadParams);
//      return res;
//    }

    try {

      long deliveryId = mapperService.insertDelivery(DeliveryStatus.YET.toString(), memberId);
      mapperService.insertOrder(OrderStatus.YET.name(), memberId, deliveryId);

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
