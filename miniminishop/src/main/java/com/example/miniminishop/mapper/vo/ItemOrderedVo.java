package com.example.miniminishop.mapper.vo;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class ItemOrderedVo {

  public long itemId;

  public String itemName;

  public int itemAmount;

  public long itemPrice;
}
