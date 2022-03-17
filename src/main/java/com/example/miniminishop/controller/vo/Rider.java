package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "라이더")
@Data
public class Rider {

  public long riderId = 0;

  public String riderName = "";

  public String riderVehicle = "";

  public String riderStatus = "";
}
