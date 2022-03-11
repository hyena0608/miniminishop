package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.mapper.miniminishopMapper;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class AddMemberHandler extends BaseHandler {

  private final miniminishopMapper mapper;

  public AddMemberResponse execute(CustomUserDetails user, AddMemberRequest req) {
    AddMemberResponse res = new AddMemberResponse();

    final int memberType = req.getMemberType();
    final String memberName = req.getMemberName();
    final String memberPhone = req.getMemberPhone();

    if(emptyParam(memberType) || emptyParam(memberName) || emptyParam(memberPhone)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      this.mapper.insertMember(memberType, memberName, memberPhone);

      // code here
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
