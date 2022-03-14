package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "상품 이름으로 조회")
@Data
public class GetItemByNameRequest {

  @ApiParam(value = "null", required = true)
  private String item_name;
}
