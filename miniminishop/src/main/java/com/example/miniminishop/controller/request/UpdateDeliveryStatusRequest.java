package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "배달 상태 수정")
@Data
public class UpdateDeliveryStatusRequest {

  @ApiParam(value = "null", required = true)
  private long delivery_id;

  @ApiParam(value = "null", required = true)
  private String delivery_status;
}
