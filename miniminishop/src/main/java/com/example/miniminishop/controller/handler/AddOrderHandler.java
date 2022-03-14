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
public class AddOrderHandler extends BaseHandler {

  private final MiniminishopMapperService mapperService;

  public AddOrderResponse execute(CustomUserDetails user, AddOrderRequest req) {
    AddOrderResponse res = new AddOrderResponse();

    final String orderStatus = req.getOrderStatus();
    final long memberId = req.getMemberId();
    final long deliveryId = req.getDeliveryId();

    if(emptyParam(orderStatus) || emptyParam(memberId) || emptyParam(deliveryId)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here
      mapperService.insertDelivery(String.valueOf(DeliveryStatus.NOTHING), memberId);
      mapperService.insertOrder(OrderStatus.YET.toString(), memberId, deliveryId);

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
