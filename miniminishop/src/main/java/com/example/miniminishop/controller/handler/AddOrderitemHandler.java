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
@RequiredArgsConstructor
public class AddOrderitemHandler extends BaseHandler {

  private final MiniminishopMapperService mapperService;

  public AddOrderitemResponse execute(CustomUserDetails user, AddOrderitemRequest req) {
    AddOrderitemResponse res = new AddOrderitemResponse();

    final long memberId = req.getMemberId();
    final long itemId = req.getItemId();
    final long itemPrice = req.getItemPrice();
    final int itemAmount = req.getItemAmount();
    final long orderId = req.getOrderId();

    if(emptyParam(memberId) || emptyParam(itemId) || emptyParam(itemPrice) || emptyParam(itemAmount) || emptyParam(orderId)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here
      mapperService.insertOrderItem(memberId, itemId, itemPrice, itemAmount, orderId);

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
