package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "μν μΆκ°")
@Data
public class InsertItemResponse extends BaseResponse {

  public long itemId = 0;
}
