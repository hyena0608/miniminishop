package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;
import com.example.miniminishop.controller.vo.ItemOrdered;

@ApiModel(description = "주문_상품리스트")
@Data
public class OrderitemDetail {

  public long orderId = 0;

  public String orderStatus = "";

  public String deliveryStatus = "";

  public List<ItemOrdered> itemsOrdered = null;
}
