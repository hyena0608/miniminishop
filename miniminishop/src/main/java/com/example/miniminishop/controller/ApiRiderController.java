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
public class ApiRiderController {
  static Logger logger = LoggerFactory.getLogger(ApiRiderController.class);

  private InsertRiderHandler insertRiderHandler;

  @RequestMapping(method = RequestMethod.POST, value = "rider/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "라이더 회원 가입")
  InsertRiderResponse insertRider(@RequestBody InsertRiderRequest req, HttpServletRequest request) {
    insertRiderHandler.setHttpServletRequest(request);
    return insertRiderHandler.execute(null, req);
  }

  private SelectRiderListByStatusHandler selectRiderListByStatusHandler;

  @RequestMapping(method = RequestMethod.GET, value = "rider/getRiderListByStatus")
  @ApiOperation(value = "라이더 배달 상태로 라이더 리스트 조회")
  SelectRiderListByStatusResponse selectRiderListByStatus(@RequestParam("riderStatus") String riderStatus, HttpServletRequest request) {
    selectRiderListByStatusHandler.setHttpServletRequest(request);
    SelectRiderListByStatusRequest req = new SelectRiderListByStatusRequest();
    req.setRiderStatus(riderStatus);
    return selectRiderListByStatusHandler.execute(null, req);
  }

  private SelectRiderByRiderIdHandler selectRiderByRiderIdHandler;

  @RequestMapping(method = RequestMethod.GET, value = "rider/getRiderByRiderId")
  @ApiOperation(value = "라이더 아이디로 라이더 조회")
  SelectRiderByRiderIdResponse selectRiderByRiderId(@RequestParam("riderId") long riderId, HttpServletRequest request) {
    selectRiderByRiderIdHandler.setHttpServletRequest(request);
    SelectRiderByRiderIdRequest req = new SelectRiderByRiderIdRequest();
    req.setRiderId(riderId);
    return selectRiderByRiderIdHandler.execute(null, req);
  }
}
