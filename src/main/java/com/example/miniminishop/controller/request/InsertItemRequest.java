package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "상품 추가")
@Data
public class InsertItemRequest {

  @ApiParam(value = "null", required = true)
  private String itemName;

  @ApiParam(value = "null", required = true)
  private int itemAmount;

  @ApiParam(value = "null", required = true)
  private long itemPrice;
}
