package com.example.miniminishop.mapper.vo;

import lombok.Data;
import java.sql.Date;
import java.sql.Time;

@Data
public class MemberVo {

  public long memberId;

  public int memberType;

  public String memberName;

  public String memberPhone;

  public  memberStartDate;
}
