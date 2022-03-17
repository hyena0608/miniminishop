package com.example.miniminishop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.miniminishop.controller.handler.*;
import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.service.CustomUserDetails;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
public class ApiOrderitemController {
  static Logger logger = LoggerFactory.getLogger(ApiOrderitemController.class);

  private InsertOrderItemHandler insertOrderItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "orderitem/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "주문상품 담기")
  InsertOrderItemResponse insertOrderItem(@RequestBody InsertOrderItemRequest req, HttpServletRequest request) {
    insertOrderItemHandler.setHttpServletRequest(request);
    return insertOrderItemHandler.execute(null, req);
  }

  private DeleteOneOrderItemHandler deleteOneOrderItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "orderitem/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "주문상품 덜기")
  DeleteOneOrderItemResponse deleteOneOrderItem(@RequestBody DeleteOneOrderItemRequest req, HttpServletRequest request) {
    deleteOneOrderItemHandler.setHttpServletRequest(request);
    return deleteOneOrderItemHandler.execute(null, req);
  }

  private SelectOrderitemByMemberIdOrderIdStatusHandler selectOrderitemByMemberIdOrderIdStatusHandler;

  @RequestMapping(method = RequestMethod.GET, value = "orderitem/getByOrderId")
  @ApiOperation(value = "회원ID || 주문ID || 주문상태로 주문상품 찾기")
  SelectOrderitemByMemberIdOrderIdStatusResponse selectOrderitemByMemberIdOrderIdStatus(@RequestParam("memberId") long memberId, @RequestParam("orderId") long orderId, @RequestParam("orderStatus") String orderStatus, HttpServletRequest request) {
    selectOrderitemByMemberIdOrderIdStatusHandler.setHttpServletRequest(request);
    SelectOrderitemByMemberIdOrderIdStatusRequest req = new SelectOrderitemByMemberIdOrderIdStatusRequest();
    req.setMemberId(memberId);
    req.setOrderId(orderId);
    req.setOrderStatus(orderStatus);
    return selectOrderitemByMemberIdOrderIdStatusHandler.execute(null, req);
  }

  private DeleteAllOrderitemHandler deleteAllOrderitemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "orderitem/deleteAll", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "모든 주문상품 지우기")
  DeleteAllOrderitemResponse deleteAllOrderitem(@RequestBody DeleteAllOrderitemRequest req, HttpServletRequest request) {
    deleteAllOrderitemHandler.setHttpServletRequest(request);
    return deleteAllOrderitemHandler.execute(null, req);
  }

  private SelectOrderitemByOrderitemIdHandler selectOrderitemByOrderitemIdHandler;

  @RequestMapping(method = RequestMethod.GET, value = "orderitem/getByOrderitemId")
  @ApiOperation(value = "주문상품ID로 주문 상품 가져오기")
  SelectOrderitemByOrderitemIdResponse selectOrderitemByOrderitemId(@RequestParam("orderitemId") long orderitemId, HttpServletRequest request) {
    selectOrderitemByOrderitemIdHandler.setHttpServletRequest(request);
    SelectOrderitemByOrderitemIdRequest req = new SelectOrderitemByOrderitemIdRequest();
    req.setOrderitemId(orderitemId);
    return selectOrderitemByOrderitemIdHandler.execute(null, req);
  }
}
