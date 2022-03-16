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

  public long insertMember(int memberType, String memberName, String memberPhone) {
    return mapper.insertMember(memberType, memberName, memberPhone);
  }

  public List<MemberVo> selectMemberList() {
    return mapper.selectMemberList();
  }

  public MemberVo selectMemberById(long memberId) {
    return mapper.selectMemberById(memberId);
  }

  public long insertDelivery(String deliveryStatus, long memberId) {
    return mapper.insertDelivery(deliveryStatus, memberId);
  }

  public long updateDelivery(long deliveryId, String deliveryStatus) {
    return mapper.updateDelivery(deliveryId, deliveryStatus);
  }

  public long insertItem(String itemName, int itemAmount, long itemPrice) {
    return mapper.insertItem(itemName, itemAmount, itemPrice);
  }

  public long deleteItem(long itemId) {
    return mapper.deleteItem(itemId);
  }

  public long updateItem(long itemId, String itemName, int itemAmount, long itemPrice) {
    return mapper.updateItem(itemId, itemName, itemAmount, itemPrice);
  }

  public List<ItemVo> selectItemList() {
    return mapper.selectItemList();
  }

  public List<ItemVo> selectItemByName(String itemName) {
    return mapper.selectItemByName(itemName);
  }

  public ItemVo selectItemById(long itemId) {
    return mapper.selectItemById(itemId);
  }

  public long updateItemByOrderitem(long itemId, int itemAmount) {
    return mapper.updateItemByOrderitem(itemId, itemAmount);
  }

  public long insertOrderItem(long memberId, long itemId, long itemPrice, int itemAmount, long orderId) {
    mapper.updateItemByOrderitem(itemId, itemAmount);
    return mapper.insertOrderItem(memberId, itemId, itemPrice, itemAmount, orderId);
  }

  public long deleteOneOrderItem(long memberId, long itemId) {
    return mapper.deleteOneOrderItem(memberId, itemId);
  }

  public List<OrderitemDetailVo> selectOrderitemByMemberIdOrderId(long memberId, long orderId) {
    return mapper.selectOrderitemByMemberIdOrderId(memberId, orderId);
  }

  public long deleteAllOrderitem() {
    return mapper.deleteAllOrderitem();
  }

  public long insertOrder(String orderStatus, long memberId, long deliveryId) {
    return mapper.insertOrder(orderStatus, memberId, deliveryId);
  }

  public long updateOrderStatus(long orderId, String orderStatus) {
    return mapper.updateOrderStatus(orderId, orderStatus);
  }
}
