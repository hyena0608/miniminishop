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

  private InsertMemberHandler insertMemberHandler;

  @RequestMapping(method = RequestMethod.POST, value = "member/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "회원 가입")
  InsertMemberResponse insertMember(@RequestBody InsertMemberRequest req, HttpServletRequest request) {
    insertMemberHandler.setHttpServletRequest(request);
    return insertMemberHandler.execute(null, req);
  }

  private SelectMemberListHandler selectMemberListHandler;

  @RequestMapping(method = RequestMethod.GET, value = "member/getMemberList")
  @ApiOperation(value = "회원 리스트 가져오기")
  SelectMemberListResponse selectMemberList(HttpServletRequest request) {
    selectMemberListHandler.setHttpServletRequest(request);
    SelectMemberListRequest req = new SelectMemberListRequest();
    return selectMemberListHandler.execute(null, req);
  }

  private SelectMemberByIdHandler selectMemberByIdHandler;

  @RequestMapping(method = RequestMethod.GET, value = "member/getMemberById")
  @ApiOperation(value = "회원 번호로 회원 찾아오기")
  SelectMemberByIdResponse selectMemberById(@RequestParam("memberId") long memberId, HttpServletRequest request) {
    selectMemberByIdHandler.setHttpServletRequest(request);
    SelectMemberByIdRequest req = new SelectMemberByIdRequest();
    req.setMemberId(memberId);
    return selectMemberByIdHandler.execute(null, req);
  }
}
