package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.util.Converter;
import com.example.miniminishop.controller.vo.Orderitem;
import com.example.miniminishop.controller.vo.OrderitemDetail;
import com.example.miniminishop.mapper.MiniminishopMapper;
import com.example.miniminishop.mapper.vo.OrderitemDetailVo;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class SelectOrderitemByMemberIdOrderIdStatusHandler extends BaseHandler {

  private final MiniminishopMapper mapper;

  public SelectOrderitemByMemberIdOrderIdStatusResponse execute(CustomUserDetails user, SelectOrderitemByMemberIdOrderIdStatusRequest req) {
    SelectOrderitemByMemberIdOrderIdStatusResponse res = new SelectOrderitemByMemberIdOrderIdStatusResponse();

    final long memberId = req.getMemberId();
    final long orderId = req.getOrderId();
    final String orderStatus = req.getOrderStatus();

//    if(emptyParam(memberId) || emptyParam(orderId) || emptyParam(orderStatus)) {
//      res.setCode(ResultCode.BadParams);
//      return res;
//    }

    try {

      List<OrderitemDetailVo> orderitemDetailVoList = mapper.selectOrderitemByMemberIdOrderIdStatus(memberId, orderId, orderStatus);
      List<OrderitemDetail> orderitemList = orderitemDetailVoList.stream().map(o -> Converter.convert(o, OrderitemDetail.class)).collect(Collectors.toList());

      res.setOrderitemsDetail(orderitemList);
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
