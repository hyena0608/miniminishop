package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.util.Converter;
import com.example.miniminishop.controller.vo.Member;
import com.example.miniminishop.mapper.MiniminishopMapper;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.mapper.vo.MemberVo;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Component
@RequiredArgsConstructor
public class SelectMemberListHandler extends BaseHandler {

  private final MiniminishopMapper mapper;

  public SelectMemberListResponse execute(CustomUserDetails user, SelectMemberListRequest req) {
    SelectMemberListResponse res = new SelectMemberListResponse();

    try {

      List<MemberVo> findMemberVoList = mapper.selectMemberList();
      List<Member> findMemberList = findMemberVoList.stream().map(o -> Converter.convert(o, Member.class)).collect(Collectors.toList());

      res.setMembers(findMemberList);
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
