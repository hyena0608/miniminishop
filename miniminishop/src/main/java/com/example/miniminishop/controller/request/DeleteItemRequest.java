package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "상품 삭제")
@Data
public class DeleteItemRequest {

  @ApiParam(value = "null", required = true)
  private long itemId;
}
