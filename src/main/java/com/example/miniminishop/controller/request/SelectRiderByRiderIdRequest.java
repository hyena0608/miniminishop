package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "라이더 아이디로 라이더 조회")
@Data
public class SelectRiderByRiderIdRequest {

  @ApiParam(value = "null", required = true)
  private long riderId;
}
