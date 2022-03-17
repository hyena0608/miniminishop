package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.OrderitemDetail;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "회원ID || 주문ID || 주문상태로 주문상품 조회")
@Data
public class SelectOrderitemByMemberIdOrderIdStatusResponse extends BaseResponse {

  public List<OrderitemDetail> orderitemsDetail = null;
}
