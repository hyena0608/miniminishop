package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.mapper.MiniminishopMapper;
import com.example.miniminishop.mapper.vo.OrderitemVo;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class DeleteOneOrderItemHandler extends BaseHandler {

  private final MiniminishopMapper mapper;

  public DeleteOneOrderItemResponse execute(CustomUserDetails user, DeleteOneOrderItemRequest req) {
    DeleteOneOrderItemResponse res = new DeleteOneOrderItemResponse();

    final long orderitemId = req.getOrderitemId();

    try {
      OrderitemVo findOrderitem = mapper.selectOrderitemByOrderitemId(orderitemId);
      mapper.deleteOneOrderItem(orderitemId, findOrderitem.getMemberId(), findOrderitem.getItemId());
      mapper.updateItemByOrderitem(findOrderitem.getItemId(), findOrderitem.getItemAmount(), 1);
      System.out.println("findOrderitem = " + findOrderitem.getItemAmount());

      res.setOrderitemId(orderitemId);
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
