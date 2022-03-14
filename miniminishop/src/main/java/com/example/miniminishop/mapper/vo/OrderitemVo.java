package com.example.miniminishop.mapper.vo;

import lombok.Data;

@Data
public class OrderitemVo {

  public long orderitem_id;

  public long memberId;

  public long itemId;

  public long itemPrice;

  public int itemAmount;

  public long orderId;
}
