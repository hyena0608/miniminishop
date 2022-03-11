package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class orderitemVo {

  public long orderitemId;

  public long totalPrice;

  public int totalCount;

  public long orderId;

  public long itemId;
}
