package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.controller.status.OrderStatus;
import com.example.miniminishop.mapper.MiniminishopMapper;
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
public class UpdateOrderStatusHandler extends BaseHandler {

    private final MiniminishopMapper mapper;

    public UpdateOrderStatusResponse execute(CustomUserDetails user, UpdateOrderStatusRequest req) {
        UpdateOrderStatusResponse res = new UpdateOrderStatusResponse();

        final long orderId = req.getOrderId();
        final String orderStatus = req.getOrderStatus();

        if (emptyParam(orderId) || emptyParam(orderStatus)) {
            res.setCode(ResultCode.BadParams);
            return res;
        }

        try {

            if (orderStatus.equals(OrderStatus.COMPLETED.toString())) {
                mapper.updateOrderStatus(orderId, orderStatus);
                res.setCode(ResultCode.Success);
                return res;
            } else {
                res.setCode(ResultCode.Failed);
                return res;
            }


        } catch (Exception e) {
            log.error(e.toString());
            res.setCode(ResultCode.Failed);
            return res;
        }
    }
}
