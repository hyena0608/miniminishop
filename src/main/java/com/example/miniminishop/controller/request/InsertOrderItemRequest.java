package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "주문상품 추가")
@Data
public class InsertOrderItemRequest {

  @ApiParam(value = "null", required = true)
  private long memberId;

  @ApiParam(value = "null", required = true)
  private long itemId;

  @ApiParam(value = "null", required = true)
  private long itemPrice;

  @ApiParam(value = "null", required = true)
  private int itemAmount;

  @ApiParam(value = "null", required = true)
  private long orderId;
}
