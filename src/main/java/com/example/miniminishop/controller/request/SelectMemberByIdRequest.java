package com.example.miniminishop.controller.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@ApiModel(description = "회원 ID로 회원 조회")
@Data
public class SelectMemberByIdRequest {

  @ApiParam(value = "null", required = true)
  private long memberId;
}
