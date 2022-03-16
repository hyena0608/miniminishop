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

  public long orderitem_id = 0;

  public long memberId = 0;

  public long orderId = 0;

  public long itemId = 0;

  public long itemPrice = 0;

  public int itemAmount = 0;
}
