package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.util.Converter;
import com.example.miniminishop.controller.vo.OrderitemDetail;
import com.example.miniminishop.mapper.MiniminishopMapperService;
import com.example.miniminishop.mapper.vo.OrderitemDetailVo;
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
public class SelectOrderitemByMemberIdOrderIdHandler extends BaseHandler {

    private final MiniminishopMapperService mapperService;

    public SelectOrderitemByMemberIdOrderIdResponse execute(CustomUserDetails user, SelectOrderitemByMemberIdOrderIdRequest req) {
        SelectOrderitemByMemberIdOrderIdResponse res = new SelectOrderitemByMemberIdOrderIdResponse();

        final long memberId = req.getMemberId();
        final long orderId = req.getOrderId();

//    if(emptyParam(memberId) || emptyParam(orderId)) {
//      res.setCode(ResultCode.BadParams);
//      return res;
//    }

        try {

            List<OrderitemDetailVo> orderitemDetailVoList = mapperService.selectOrderitemByMemberIdOrderId(memberId, orderId);

            orderitemDetailVoList.stream().forEach(System.out::println);


            List<OrderitemDetail> result = orderitemDetailVoList
                    .stream()
                    .map(o -> Converter.convert(o, OrderitemDetail.class))
                    .collect(Collectors.toList());


            result.stream().forEach(System.out::println);


            res.setOrderitemsDetail(orderitemDetailVoList);

//            res.setOrderitemsDetail(result);
            res.setCode(ResultCode.Success);
            return res;
        } catch (Exception e) {
            log.error(e.toString());
            res.setCode(ResultCode.Failed);
            return res;
        }
    }
}
