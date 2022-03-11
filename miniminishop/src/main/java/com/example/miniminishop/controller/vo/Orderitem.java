package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "주문_상품")
@Data
public class Orderitem {

  public long orderitemId = 0;

  public long totalPrice = 0;

  public int totalCount = 0;

  public long orderId = 0;

  public long itemId = 0;
}
