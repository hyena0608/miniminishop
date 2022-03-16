package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.Orderitem;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "주문상품ID로 주문 상품 가져오기")
@Data
public class SelectOrderitemByOrderitemIdResponse extends BaseResponse {

  public Orderitem orderitem = null;
}
