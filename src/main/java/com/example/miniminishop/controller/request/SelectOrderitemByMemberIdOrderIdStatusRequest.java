package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "회원ID || 주문ID || 주문상태로 주문상품 조회")
@Data
public class SelectOrderitemByMemberIdOrderIdStatusRequest {

  @ApiParam(value = "null", required = true)
  private long memberId;

  @ApiParam(value = "null", required = true)
  private long orderId;

  @ApiParam(value = "null", required = true)
  private String orderStatus;
}
