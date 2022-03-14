package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "주문")
@Data
public class Orders {

  public long orderId = 0;

  public String orderStatus = "";

  public long memberId = 0;

  public long deliveryId = 0;
}
