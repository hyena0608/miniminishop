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
public class ApiOrderiemController {
  static Logger logger = LoggerFactory.getLogger(ApiOrderiemController.class);

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

  private SelectOrderitemByMemberIdOrderIdHandler selectOrderitemByMemberIdOrderIdHandler;

  @RequestMapping(method = RequestMethod.GET, value = "orderitem/getByOrderId")
  @ApiOperation(value = "주문상품 멤버 아이디, 주문 아이디로 찾기")
  SelectOrderitemByMemberIdOrderIdResponse selectOrderitemByMemberIdOrderId(@RequestParam("memberId") long memberId, @RequestParam("orderId") long orderId, HttpServletRequest request) {
    selectOrderitemByMemberIdOrderIdHandler.setHttpServletRequest(request);
    SelectOrderitemByMemberIdOrderIdRequest req = new SelectOrderitemByMemberIdOrderIdRequest();
    req.setMemberId(memberId);
    req.setOrderId(orderId);
    return selectOrderitemByMemberIdOrderIdHandler.execute(null, req);
  }

  private DeleteAllOrderitemHandler deleteAllOrderitemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "orderitem/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "모든 주문상품 지우기")
  DeleteAllOrderitemResponse deleteAllOrderitem(@RequestBody DeleteAllOrderitemRequest req, HttpServletRequest request) {
    deleteAllOrderitemHandler.setHttpServletRequest(request);
    return deleteAllOrderitemHandler.execute(null, req);
  }
}
