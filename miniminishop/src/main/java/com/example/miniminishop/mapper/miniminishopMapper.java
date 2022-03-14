package com.example.miniminishop.mapper;

import com.example.miniminishop.controller.vo.Orderitem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.miniminishop.mapper.vo.*;
import java.util.List;
@Mapper
public interface MiniminishopMapper {

  int insertDelivery(@Param("deliveryStatus") String deliveryStatus, @Param("memberId") long memberId);

  void updateDelivery(@Param("deliveryId") long deliveryId, @Param("deliveryStatus") String deliveryStatus);

  int insertItem(@Param("itemName") String itemName, @Param("itemAmount") int itemAmount, @Param("itemPrice") long itemPrice);

  void deleteItem(@Param("itemId") long itemId);

  void updateItem(@Param("itemId") long itemId, @Param("itemName") String itemName, @Param("itemAmount") int itemAmount, @Param("itemPrice") long itemPrice);

  List<ItemVo> selectItemList(@Param("itemName") String itemName);

  ItemVo selectItemByName(@Param("itemName") String itemName);

  ItemVo selectItemById(@Param("itemId") long itemId);

  int insertOrder(@Param("orderStatus") String orderStatus, @Param("memberId") long memberId, @Param("deliveryId") long deliveryId);

  void updateOrderStatus(@Param("orderId") long orderId, @Param("orderStatus") String orderStatus);

  int insertMember(@Param("memberType") int memberType, @Param("memberName") String memberName, @Param("memberPhone") String memberPhone);

  void insertOrderItem(@Param("memberId") long memberId, @Param("itemId") long itemId, @Param("itemPrice") long itemPrice, @Param("itemAmount") int itemAmount, @Param("orderId") long orderId);

  void deleteOneOrderItem(@Param("memberId") long memberId, @Param("itemId") long itemId);

  void deleteAllOrderItem(@Param("memberId") long memberId);

   List<OrderitemVo> selectOrderitemByOrderId(@Param("orderId") long orderId);
}
