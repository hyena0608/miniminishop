package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

@ApiModel(description = "주문_상품리스트")
@Data
public class OrderitemDetail {

  public long orderId = 0;

  public String orderStatus = "";

  public String deliveryStatus = "";

  public List<ItemOrdered> itemsOrdered = null;
}
