package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "상품 수정")
@Data
public class UpdateItemRequest {

  @ApiParam(value = "null", required = true)
  private long item_id;

  @ApiParam(value = "null", required = true)
  private String item_name;

  @ApiParam(value = "null", required = true)
  private int item_amount;

  @ApiParam(value = "null", required = true)
  private long item_price;
}
