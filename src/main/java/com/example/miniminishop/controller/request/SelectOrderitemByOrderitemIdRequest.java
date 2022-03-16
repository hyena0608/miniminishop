package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "주문상품ID로 주문 상품 가져오기")
@Data
public class SelectOrderitemByOrderitemIdRequest {

  @ApiParam(value = "null", required = true)
  private long orderitemId;
}
