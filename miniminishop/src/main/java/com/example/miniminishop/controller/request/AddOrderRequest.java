package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "주문")
@Data
public class AddOrderRequest {

  @ApiParam(value = "null", required = true)
  private String order_status;

  @ApiParam(value = "null", required = true)
  private int order_item_amount;

  @ApiParam(value = "null", required = true)
  private long order_item_total_cash;

  @ApiParam(value = "null", required = true)
  private long member_id;

  @ApiParam(value = "null", required = true)
  private long item_id;

  @ApiParam(value = "null", required = true)
  private long delivery_id;
}
