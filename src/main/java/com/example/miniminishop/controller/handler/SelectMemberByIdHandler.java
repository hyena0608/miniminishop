package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.util.Converter;
import com.example.miniminishop.controller.vo.Member;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.mapper.vo.MemberVo;
import com.example.miniminishop.service.CustomUserDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;

import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class SelectMemberByIdHandler extends BaseHandler {

    private final MiniminishopMapperService mapperService;

    public SelectMemberByIdResponse execute(CustomUserDetails user, SelectMemberByIdRequest req) {
        SelectMemberByIdResponse res = new SelectMemberByIdResponse();

        final long memberId = req.getMemberId();

        if (emptyParam(memberId)) {
            res.setCode(ResultCode.BadParams);
            return res;
        }

        try {

            MemberVo findMember = mapperService.selectMemberById(memberId);
            Member result = Converter.convert(findMember, Member.class);

            res.setMember(result);
            res.setCode(ResultCode.Success);
            return res;
        } catch (Exception e) {
            log.error(e.toString());
            res.setCode(ResultCode.Failed);
            return res;
        }
    }
}
