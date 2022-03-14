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
public class ApiDeliveryController {
  static Logger logger = LoggerFactory.getLogger(ApiDeliveryController.class);

  private InsertDeliveryHandler insertDeliveryHandler;

  @RequestMapping(method = RequestMethod.POST, value = "delivery/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "배달 등록")
  InsertDeliveryResponse insertDelivery(@RequestBody InsertDeliveryRequest req, HttpServletRequest request) {
    insertDeliveryHandler.setHttpServletRequest(request);
    return insertDeliveryHandler.execute(null, req);
  }

  private UpdateDeliveryHandler updateDeliveryHandler;

  @RequestMapping(method = RequestMethod.POST, value = "delivery/update", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "배달 상태 수정")
  UpdateDeliveryResponse updateDelivery(@RequestBody UpdateDeliveryRequest req, HttpServletRequest request) {
    updateDeliveryHandler.setHttpServletRequest(request);
    return updateDeliveryHandler.execute(null, req);
  }
}
