package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "주문된 상품 정보")
@Data
public class ItemOrdered {

  public long itemId = 0;

  public String itemName = "";

  public int itemAmount = 0;

  public long itemPrice = 0;
}
