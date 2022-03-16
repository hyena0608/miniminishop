package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "모든 주문상품 지우기")
@Data
public class DeleteAllOrderitemResponse extends BaseResponse {

  public long orderId = 0;
}
