package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "장바구니 구매")
@Data
public class DeleteAllOrderitemRequest {

  @ApiParam(value = "null", required = true)
  private long member_id;
}
