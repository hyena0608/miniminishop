package com.example.miniminishop.mapper.vo;

import com.example.miniminishop.controller.vo.ItemOrdered;
import lombok.Data;

import java.util.List;

@Data
public class OrderitemDetailVo {


  public long orderId;

  public String orderStatus;

  public String deliveryStatus;

  public List<ItemOrdered> itemsOrdered = null;
}

