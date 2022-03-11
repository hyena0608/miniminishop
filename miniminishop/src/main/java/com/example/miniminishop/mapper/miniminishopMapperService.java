package com.example.miniminishop.mapper;

import com.example.miniminishop.mapper.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class miniminishopMapperService {

  @Autowired miniminishopMapper mapper;

  public void insertDelivery(String deliveryStatus, long memberId) {
    mapper.insertDelivery(deliveryStatus, memberId);
  }

  public void updateDelivery(long deliveryId, String deliveryStatus) {
    mapper.updateDelivery(deliveryId, deliveryStatus);
  }

  public void insertItem(String itemName, int itemAmount, long itemPrice) {
    mapper.insertItem(itemName, itemAmount, itemPrice);
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

  public ItemVo selectItem(String itemName) {
    return mapper.selectItem(itemName);
  }

  public void insertOrder(String orderStatus, long memberId, long deliveryId) {
    mapper.insertOrder(orderStatus, memberId, deliveryId);
  }

  public void updateOrderStatus(long orderId, String orderStatus) {
    mapper.updateOrderStatus(orderId, orderStatus);
  }

  public void insertMember(int memberType, String memberName, String memberPhone) {
    mapper.insertMember(memberType, memberName, memberPhone);
  }

  public void insertOrderItem(long totalPrice, int totalCount, long orderId, long itemId) {
    mapper.insertOrderItem(totalPrice, totalCount, orderId, itemId);
  }
}
