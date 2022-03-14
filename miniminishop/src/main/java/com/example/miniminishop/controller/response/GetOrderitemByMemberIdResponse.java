package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.Orderitem;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "주문상품 주문 아이디로 찾기")
@Data
public class GetOrderitemByMemberIdResponse extends BaseResponse {

  public List<Orderitem> orderitems = null;
}
