package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "주문상품 주문 아이디로 찾기")
@Data
public class GetOrderitemByMemberIdRequest {

  @ApiParam(value = "null", required = true)
  private long member_id;
}
