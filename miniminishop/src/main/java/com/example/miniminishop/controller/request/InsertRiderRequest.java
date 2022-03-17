package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "라이더 회원 가입")
@Data
public class InsertRiderRequest {

  @ApiParam(value = "null", required = true)
  private String riderName;

  @ApiParam(value = "null", required = true)
  private String riderVehicle;
}
