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

  @RequestMapping(method = RequestMethod.POST, value = "orderitem/remove", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "주문상품 덜기")
  DeleteOneOrderItemResponse deleteOneOrderItem(@RequestBody DeleteOneOrderItemRequest req, HttpServletRequest request) {
    deleteOneOrderItemHandler.setHttpServletRequest(request);
    return deleteOneOrderItemHandler.execute(null, req);
  }

  private GetOrderitemByMemberIdHandler getOrderitemByMemberIdHandler;

  @RequestMapping(method = RequestMethod.GET, value = "ordertiem/getByOrderId")
  @ApiOperation(value = "주문상품 주문 아이디로 찾기")
  GetOrderitemByMemberIdResponse getOrderitemByMemberId(@RequestParam("member_id") long member_id, HttpServletRequest request) {
    getOrderitemByMemberIdHandler.setHttpServletRequest(request);
    GetOrderitemByMemberIdRequest req = new GetOrderitemByMemberIdRequest();
    req.setMember_id(member_id);
    return getOrderitemByMemberIdHandler.execute(null, req);
  }
}
