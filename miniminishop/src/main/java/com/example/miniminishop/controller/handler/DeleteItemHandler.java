package com.example.miniminishop.controller.handler;

import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import com.example.miniminishop.controller.ResultCode;
import java.util.List;

@Slf4j
@Component
public class DeleteItemHandler extends BaseHandler {

  public DeleteItemResponse execute(DeleteItemRequest req) {
    DeleteItemResponse res = new DeleteItemResponse();

    final long item_id = req.getItem_id();

    if(emptyParam(item_id)) {
      res.setCode(ResultCode.BadParams);
      return res;
    }

    try {
      // code here
      res.setCode(ResultCode.Success);
      return res;
    }
    catch(Exception e) {
      log.error(e.toString());
      res.setCode(ResultCode.Failed);
      return res;
    }
  }
}
