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

  private AddDeliveryHandler addDeliveryHandler;

  @RequestMapping(method = RequestMethod.GET, value = "delivery/add")
  @ApiOperation(value = "배달 등록")
  AddDeliveryResponse addDelivery(@RequestParam("delivery_status") String delivery_status, @RequestParam("member_id") long member_id, HttpServletRequest request) {
    addDeliveryHandler.setHttpServletRequest(request);
    AddDeliveryRequest req = new AddDeliveryRequest();
    req.setDelivery_status(delivery_status);
    req.setMember_id(member_id);
    return addDeliveryHandler.execute(null, req);
  }

  private UpdateDeliveryStatusHandler updateDeliveryStatusHandler;

  @RequestMapping(method = RequestMethod.POST, value = "delivery/update", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "배달 상태 수정")
  UpdateDeliveryStatusResponse updateDeliveryStatus(@RequestBody UpdateDeliveryStatusRequest req, HttpServletRequest request) {
    updateDeliveryStatusHandler.setHttpServletRequest(request);
    return updateDeliveryStatusHandler.execute(null, req);
  }
}
