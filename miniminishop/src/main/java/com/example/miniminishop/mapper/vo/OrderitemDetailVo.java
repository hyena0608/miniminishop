package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class OrderitemDetailVo {

  public long orderId;

  public String orderStatus;

  public String deliveryStatus;
}
