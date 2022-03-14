package com.example.miniminishop.controller.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.sql.Date;
import java.sql.Time;

@ApiModel(description = "회원")
@Data
public class Member {

  public long memberId = 0;

  public int memberType = 0;

  public String memberName = "";

  public String memberPhone = "";

  public LocalDateTime memberStartDate;
}
