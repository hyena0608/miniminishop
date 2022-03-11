package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class OrderVo {

  public long orderId;

  public String orderStatus;

  public long memberId;

  public long deliveryId;
}
