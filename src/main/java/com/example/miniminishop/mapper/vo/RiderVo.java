package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class RiderVo {

  public long riderId;

  public String riderName;

  public String riderVehicle;

  public String riderStatus;
}
