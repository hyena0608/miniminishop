package com.example.miniminishop.controller.handler;

import com.example.miniminishop.mapper.miniminishopMapper;
import com.example.miniminishop.mapper.miniminishopMapperService;

import javax.servlet.http.HttpServletRequest;

public class BaseHandler {

//  /**
//   * mapper 추가
//   */
//  protected miniminishopMapperService mapper;

  protected HttpServletRequest request;

  boolean emptyParam(String str) {
    if(str == null || str.isEmpty()) {
      return true;
    }
    return false;
  }

  boolean emptyParam(int v) {
    if(v == 0) {
      return true;
    }
    return false;
  }

  boolean emptyParam(long v) {
    if(v == 0) {
      return true;
    }
    return false;
  }

  boolean emptyParam(double v) {
    if(v == 0) {
      return true;
    }
    return false;
  }

  public void setHttpServletRequest(HttpServletRequest request) {
    this.request = request;
  }
}
