package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@ApiModel(description = "주문")
@Data
public class Orders {

  public long orderId = 0;

  public String orderStatus = "";

  public long memberId = 0;

  public long deliveryId = 0;
}
