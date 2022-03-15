package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class OrderitemVo {

  public long orderitem_id;

  public long memberId;

  public long orderId;

  public long itemId;

  public long itemPrice;

  public int itemAmount;
}
