package com.example.miniminishop.controller.response;

import com.example.miniminishop.mapper.vo.OrderitemDetailVo;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.OrderitemDetail;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "주문상품 멤버 아이디, 주문 아이디로 찾기")
@Data
public class SelectOrderitemByMemberIdOrderIdResponse extends BaseResponse {

  public List<OrderitemDetailVo> orderitemsDetail = null;
}
