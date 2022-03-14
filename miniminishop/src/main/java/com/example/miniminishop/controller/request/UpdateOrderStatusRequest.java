package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "주문 상태 변경")
@Data
public class UpdateOrderStatusRequest {

  @ApiParam(value = "null", required = true)
  private long orderId;
}
