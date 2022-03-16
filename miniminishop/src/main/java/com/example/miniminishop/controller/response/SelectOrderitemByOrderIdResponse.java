package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.OrderitemDetail;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "주문 아이디로 주문상품 찾기")
@Data
public class SelectOrderitemByOrderIdResponse extends BaseResponse {

  public List<OrderitemDetail> orderitemsDetail = null;
}
