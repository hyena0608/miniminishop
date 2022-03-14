package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "상품 아이디로 조회")
@Data
public class GetItemByIdRequest {

  @ApiParam(value = "null", required = true)
  private long item_id;
}
