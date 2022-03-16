package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.OrderitemDetail;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "주문상품 멤버 아이디, 주문 아이디로 찾기")
@Data
public class SelectOrderitemByMemberIdOrderIdResponse extends BaseResponse {

  public List<OrderitemDetail> orderitemsDetail = null;
}
