package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "주문")
@Data
public class AddOrderRequest {

  @ApiParam(value = "null", required = true)
  private String orderStatus;

  @ApiParam(value = "null", required = true)
  private long memberId;

  @ApiParam(value = "null", required = true)
  private long deliveryId;
}
