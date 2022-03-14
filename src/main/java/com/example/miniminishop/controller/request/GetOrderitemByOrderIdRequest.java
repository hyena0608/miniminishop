package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "장바구니 주문 아이디로 찾기")
@Data
public class GetOrderitemByOrderIdRequest {

  @ApiParam(value = "null", required = true)
  private long orderId;
}
