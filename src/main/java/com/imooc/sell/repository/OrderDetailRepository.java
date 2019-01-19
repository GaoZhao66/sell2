package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Administrator on 2019/1/9
 * 订单详情表
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
   /** 根据订单id来查 */
   List<OrderDetail> findByOrderId(String orderId);
}
