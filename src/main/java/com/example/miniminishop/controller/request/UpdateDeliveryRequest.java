package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "배달 상태 수정")
@Data
public class UpdateDeliveryRequest {

  @ApiParam(value = "null", required = true)
  private long deliveryId;

  @ApiParam(value = "null", required = true)
  private String deliveryStatus;
}
