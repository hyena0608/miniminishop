package com.example.miniminishop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.miniminishop.controller.handler.*;
import com.example.miniminishop.controller.request.*;
import com.example.miniminishop.controller.response.*;
import com.example.miniminishop.service.CustomUserDetails;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/")
public class ApiItemController {
  static Logger logger = LoggerFactory.getLogger(ApiItemController.class);

  private AddItemHandler addItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "item/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "상품 추가")
  AddItemResponse addItem(@RequestBody AddItemRequest req, HttpServletRequest request) {
    addItemHandler.setHttpServletRequest(request);
    return addItemHandler.execute(null, req);
  }

  private DeleteItemHandler deleteItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "item/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "상품 삭제")
  DeleteItemResponse deleteItem(@RequestBody DeleteItemRequest req, HttpServletRequest request) {
    deleteItemHandler.setHttpServletRequest(request);
    return deleteItemHandler.execute(null);
  }

  private UpdateItemHandler updateItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "item/update", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "상품 수정")
  UpdateItemResponse updateItem(@RequestBody UpdateItemRequest req, HttpServletRequest request) {
    updateItemHandler.setHttpServletRequest(request);
    return updateItemHandler.execute(null);
  }

  private GetItemListHandler getItemListHandler;

  @RequestMapping(method = RequestMethod.GET, value = "item/list")
  @ApiOperation(value = "상품 목록 조회")
  GetItemListResponse getItemList(HttpServletRequest request) {
    getItemListHandler.setHttpServletRequest(request);
    GetItemListRequest req = new GetItemListRequest();
    return getItemListHandler.execute(null);
  }

  private GetItemHandler getItemHandler;

  @RequestMapping(method = RequestMethod.GET, value = "item/get")
  @ApiOperation(value = "상품 조회")
  GetItemResponse getItem(@RequestParam("item_id") long item_id, HttpServletRequest request) {
    getItemHandler.setHttpServletRequest(request);
    GetItemRequest req = new GetItemRequest();
    req.setItem_id(item_id);
    return getItemHandler.execute(null);
  }
}
