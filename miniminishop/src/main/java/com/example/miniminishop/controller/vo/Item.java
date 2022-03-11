package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "상품")
@Data
public class Item {

  public long itemId = 0;

  public String itemName = "";

  public int itemAmount = 0;

  public long itemPrice = 0;

  public String updateDt = "";
}
