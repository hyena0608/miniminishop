package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "라이더 배달 상태로 라이더 리스트 조회")
@Data
public class SelectRiderListByStatusRequest {

  @ApiParam(value = "null", required = true)
  private String riderStatus;
}
