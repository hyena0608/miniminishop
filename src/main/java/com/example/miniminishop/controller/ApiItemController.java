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

  private InsertItemHandler insertItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "item/add", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "상품 추가")
  InsertItemResponse insertItem(@RequestBody InsertItemRequest req, HttpServletRequest request) {
    insertItemHandler.setHttpServletRequest(request);
    return insertItemHandler.execute(null, req);
  }

  private DeleteItemHandler deleteItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "item/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "상품 삭제")
  DeleteItemResponse deleteItem(@RequestBody DeleteItemRequest req, HttpServletRequest request) {
    deleteItemHandler.setHttpServletRequest(request);
    return deleteItemHandler.execute(null, req);
  }

  private UpdateItemHandler updateItemHandler;

  @RequestMapping(method = RequestMethod.POST, value = "item/update", consumes = MediaType.APPLICATION_JSON_VALUE)
  @ApiOperation(value = "상품 수정")
  UpdateItemResponse updateItem(@RequestBody UpdateItemRequest req, HttpServletRequest request) {
    updateItemHandler.setHttpServletRequest(request);
    return updateItemHandler.execute(null, req);
  }

  private SelectItemListHandler selectItemListHandler;

  @RequestMapping(method = RequestMethod.GET, value = "item/list")
  @ApiOperation(value = "상품 목록 조회")
  SelectItemListResponse selectItemList(HttpServletRequest request) {
    selectItemListHandler.setHttpServletRequest(request);
    SelectItemListRequest req = new SelectItemListRequest();
    return selectItemListHandler.execute(null, req);
  }

  private SelectItemByNameHandler selectItemByNameHandler;

  @RequestMapping(method = RequestMethod.GET, value = "item/getByName")
  @ApiOperation(value = "상품 이름으로 조회")
  SelectItemByNameResponse selectItemByName(@RequestParam("itemName") String itemName, HttpServletRequest request) {
    selectItemByNameHandler.setHttpServletRequest(request);
    SelectItemByNameRequest req = new SelectItemByNameRequest();
    req.setItemName(itemName);
    return selectItemByNameHandler.execute(null, req);
  }

  private SelectItemByIdHandler selectItemByIdHandler;

  @RequestMapping(method = RequestMethod.GET, value = "item/getById")
  @ApiOperation(value = "상품 아이디로 조회")
  SelectItemByIdResponse selectItemById(@RequestParam("itemId") long itemId, HttpServletRequest request) {
    selectItemByIdHandler.setHttpServletRequest(request);
    SelectItemByIdRequest req = new SelectItemByIdRequest();
    req.setItemId(itemId);
    return selectItemByIdHandler.execute(null, req);
  }
}
