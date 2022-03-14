package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "회원 가입")
@Data
public class InsertMemberRequest {

  @ApiParam(value = "null", required = true)
  private int memberType;

  @ApiParam(value = "null", required = true)
  private String memberName;

  @ApiParam(value = "null", required = true)
  private String memberPhone;
}
