package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "주문된 상품 정보")
@Data
public class ItemOrdered {

  public long itemId = 0;

  public String itemName = "";

  public int itemAmount = 0;

  public long itemPrice = 0;
}
