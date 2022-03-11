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
public class ApiMemberController {
  static Logger logger = LoggerFactory.getLogger(ApiMemberController.class);

  private AddMemberHandler addMemberHandler;

  @RequestMapping(method = RequestMethod.POST, value = "member/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "회원 가입")
  AddMemberResponse addMember(@RequestBody AddMemberRequest req, HttpServletRequest request) {
    addMemberHandler.setHttpServletRequest(request);
    return addMemberHandler.execute(null, req);
  }
}
