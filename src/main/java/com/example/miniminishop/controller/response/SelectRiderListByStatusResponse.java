package com.example.miniminishop.controller.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import com.example.miniminishop.controller.vo.Rider;
import java.util.HashMap;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "라이더 배달 상태로 라이더 리스트 조회")
@Data
public class SelectRiderListByStatusResponse extends BaseResponse {

  public List<Rider> riders = null;
}
