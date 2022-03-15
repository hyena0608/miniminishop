package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class InsertMemberHandler extends BaseHandler {

  private final MiniminishopMapperService mapperService;

  public InsertMemberResponse execute(CustomUserDetails user, InsertMemberRequest req) {
    InsertMemberResponse res = new InsertMemberResponse();

    final int memberType = req.getMemberType();
    final String memberName = req.getMemberName();
    final String memberPhone = req.getMemberPhone();

    if(emptyParam(memberType) || emptyParam(memberName) || emptyParam(memberPhone)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here

      mapperService.insertMember(memberType, memberName, memberPhone);

      res.setCode(ResultCode.Success);
      return res;
    }
    catch(Exception e) {
      log.error(e.toString());
      res.setCode(ResultCode.Failed);
      return res;
    }
  }
}
