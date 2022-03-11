package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class DeliveryVo {

  public long deliveryId;

  public String deliveryStatus;

  public long memberId;
}
