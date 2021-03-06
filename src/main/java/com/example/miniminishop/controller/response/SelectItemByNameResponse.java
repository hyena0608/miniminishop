package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.Item;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "상품 이름으로 조회")
@Data
public class SelectItemByNameResponse extends BaseResponse {

  public List<Item> items = null;
}
