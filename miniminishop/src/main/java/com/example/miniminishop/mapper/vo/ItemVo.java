package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class ItemVo {

  public long itemId;

  public String itemName;

  public int itemAmount;

  public long itemPrice;

  public String updateDt;
}
