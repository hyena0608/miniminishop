package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "라이더 상태 바꾸기")
@Data
public class UpdateRiderStatusResponse extends BaseResponse {

  public long riderId = 0;
}
