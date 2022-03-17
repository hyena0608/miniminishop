package com.example.miniminishop.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.example.miniminishop.mapper.vo.*;
import java.util.List;
@Mapper
public interface MiniminishopMapper {

  long insertMember(@Param("memberType") int memberType, @Param("memberName") String memberName, @Param("memberPhone") String memberPhone);

  List<MemberVo> selectMemberList();

  MemberVo selectMemberById(@Param("memberId") long memberId);

  long insertDelivery(@Param("deliveryStatus") String deliveryStatus, @Param("memberId") long memberId);

  long updateDelivery(@Param("deliveryId") long deliveryId, @Param("deliveryStatus") String deliveryStatus);

  long insertItem(@Param("itemName") String itemName, @Param("itemAmount") int itemAmount, @Param("itemPrice") long itemPrice);

  long deleteItem(@Param("itemId") long itemId);

  long updateItem(@Param("itemId") long itemId, @Param("itemName") String itemName, @Param("itemAmount") int itemAmount, @Param("itemPrice") long itemPrice);

  List<ItemVo> selectItemList();

  List<ItemVo> selectItemByName(@Param("itemName") String itemName);

  ItemVo selectItemById(@Param("itemId") long itemId);

  long updateItemByOrderitem(@Param("itemId") long itemId, @Param("itemAmount") int itemAmount, @Param("type") long type);

  long insertOrderItem(@Param("memberId") long memberId, @Param("itemId") long itemId, @Param("itemPrice") long itemPrice, @Param("itemAmount") int itemAmount, @Param("orderId") long orderId);

  long deleteOneOrderItem(@Param("orderitemId") long orderitemId, @Param("memberId") long memberId, @Param("itemId") long itemId);

  List<OrderitemDetailVo> selectOrderitemByMemberIdOrderIdStatus(@Param("memberId") long memberId, @Param("orderId") long orderId, @Param("orderStatus") String orderStatus);

  long deleteAllOrderitem();

  OrderitemVo selectOrderitemByOrderitemId(@Param("orderitemId") long orderitemId);

  long insertOrder(@Param("orderStatus") String orderStatus, @Param("memberId") long memberId, @Param("deliveryId") long deliveryId, @Param("riderId") long riderId);

  long updateOrderStatus(@Param("orderId") long orderId, @Param("orderStatus") String orderStatus);

  void insertRider(@Param("riderName") String riderName, @Param("riderVehicle") String riderVehicle);

  void selectRiderListByStatus(@Param("riderStatus") String riderStatus);

  void selectRiderByRiderId(@Param("orderId") long orderId);

  void updateRiderStatus(@Param("rider_id") long rider_id, @Param("riderStatus") String riderStatus);
}
