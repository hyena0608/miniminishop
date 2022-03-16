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
public class DeleteAllOrderitemHandler extends BaseHandler {

  private final MiniminishopMapperService mapperService;

  public DeleteAllOrderitemResponse execute(CustomUserDetails user, DeleteAllOrderitemRequest req) {
    DeleteAllOrderitemResponse res = new DeleteAllOrderitemResponse();

    final long orderId = req.getOrderId();

    if(emptyParam(orderId)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {

      long delOrderId = mapperService.deleteAllOrderitem();

      res.setOrderId(delOrderId);
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
