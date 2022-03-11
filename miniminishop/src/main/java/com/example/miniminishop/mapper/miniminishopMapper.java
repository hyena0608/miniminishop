package com.example.miniminishop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.miniminishop.mapper.vo.*;
import java.util.List;
@Mapper
public interface miniminishopMapper {

  void insertDelivery(@Param("deliveryStatus") String deliveryStatus, @Param("memberId") long memberId);

  void updateDelivery(@Param("deliveryId") long deliveryId, @Param("deliveryStatus") String deliveryStatus);

  void insertItem(@Param("itemName") String itemName, @Param("itemAmount") int itemAmount, @Param("itemPrice") long itemPrice);

  void deleteItem(@Param("itemId") long itemId);

  void updateItem(@Param("itemId") long itemId, @Param("itemName") String itemName, @Param("itemAmount") int itemAmount, @Param("itemPrice") long itemPrice);

  void selectItemList(@Param("itemName") String itemName);

  void selectItem(@Param("itemName") String itemName);

  void insertOrder(@Param("orderStatus") String orderStatus, @Param("memberId") long memberId, @Param("deliveryId") long deliveryId);

  void updateOrderStatus(@Param("orderId") long orderId, @Param("orderStatus") String orderStatus);

  void insertMember(@Param("memberType") int memberType, @Param("memberName") String memberName, @Param("memberPhone") String memberPhone);

  void insertOrderItem(@Param("totalPrice") long totalPrice, @Param("totalCount") int totalCount, @Param("orderId") long orderId, @Param("itemId") long itemId);
}
