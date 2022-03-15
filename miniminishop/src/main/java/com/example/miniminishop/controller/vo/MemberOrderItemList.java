package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;
import com.example.miniminishop.controller.vo.Item;

@ApiModel(description = "회원_주문_상품_리스트")
@Data
public class MemberOrderItemList {

  public String memberName = "";

  public String itemName = "";

  public long orderId = 0;

  public List<Item> item = null;
}
