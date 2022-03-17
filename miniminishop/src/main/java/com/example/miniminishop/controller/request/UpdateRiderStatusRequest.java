package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "라이더 상태 바꾸기")
@Data
public class UpdateRiderStatusRequest {

  @ApiParam(value = "null", required = true)
  private long riderId;

  @ApiParam(value = "null", required = true)
  private String riderStatus;
}
