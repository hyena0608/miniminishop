package com.example.miniminishop.mapper;

import com.example.miniminishop.mapper.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class MiniminishopMapperService {

  @Autowired
   MiniminishopMapper mapper;

  public int insertDelivery(String deliveryStatus, long memberId) {
    return mapper.insertDelivery(deliveryStatus, memberId);
  }

  public void updateDelivery(long deliveryId, String deliveryStatus) {
    mapper.updateDelivery(deliveryId, deliveryStatus);
  }

  public int insertItem(String itemName, int itemAmount, long itemPrice) {
    return mapper.insertItem(itemName, itemAmount, itemPrice);
  }

  public void deleteItem(long itemId) {
    mapper.deleteItem(itemId);
  }

  public void updateItem(long itemId, String itemName, int itemAmount, long itemPrice) {
    mapper.updateItem(itemId, itemName, itemAmount, itemPrice);
  }

  public List<ItemVo> selectItemList(String itemName) {
    return mapper.selectItemList(itemName);
  }

  public ItemVo selectItemByName(String itemName) {
    return mapper.selectItemByName(itemName);
  }

  public ItemVo selectItemById(long itemId) {
    return mapper.selectItemById(itemId);
  }

  public int insertOrder(String orderStatus, long memberId, long deliveryId) {
    return mapper.insertOrder(orderStatus, memberId, deliveryId);
  }

  public void updateOrderStatus(long orderId, String orderStatus) {
    mapper.updateOrderStatus(orderId, orderStatus);
  }

  public int insertMember(int memberType, String memberName, String memberPhone) {
    return mapper.insertMember(memberType, memberName, memberPhone);
  }

  public void insertOrderItem(long memberId, long itemId, long itemPrice, int itemAmount, long orderId) {
    mapper.insertOrderItem(memberId, itemId, itemPrice, itemAmount, orderId);
  }

  public void deleteOneOrderItem(long memberId, long itemId) {
    mapper.deleteOneOrderItem(memberId, itemId);
  }

  public void deleteAllOrderItem(long memberId) {
    mapper.deleteAllOrderItem(memberId);
  }

  public List<OrderitemVo> selectOrderitemByOrderId(long orderId) {
    return mapper.selectOrderitemByOrderId(orderId);
  }
}
