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
public class ApiOrderController {
  static Logger logger = LoggerFactory.getLogger(ApiOrderController.class);

  private AddOrderHandler addOrderHandler;

  @RequestMapping(method = RequestMethod.POST, value = "order/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "주문")
  AddOrderResponse addOrder(@RequestBody AddOrderRequest req, HttpServletRequest request) {
    addOrderHandler.setHttpServletRequest(request);
    return addOrderHandler.execute(null, req);
  }

  private CancelOrderHandler cancelOrderHandler;

  @RequestMapping(method = RequestMethod.POST, value = "order/status", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "주문 상태 변경")
  CancelOrderResponse cancelOrder(@RequestBody CancelOrderRequest req, HttpServletRequest request) {
    cancelOrderHandler.setHttpServletRequest(request);
    return cancelOrderHandler.execute(null, req);
  }
}
