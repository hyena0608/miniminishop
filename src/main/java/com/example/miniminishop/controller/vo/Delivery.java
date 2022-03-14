package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "배달")
@Data
public class Delivery {

  public long deliveryId = 0;

  public String deliveryStatus = "";

  public long member_id = 0;

  public long memberId = 0;
}
