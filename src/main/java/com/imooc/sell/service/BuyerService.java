package com.imooc.sell.service;

import com.imooc.sell.dto.OrderDto;

/**
 * @Author gaozhao
 * @创建时间 2019/1/11
 * @描述
 **/
public interface BuyerService {

    /**查询一个订单*/
    OrderDto findOrderOne(String openid, String orderId);

    /**取消订单*/
    OrderDto cancelOrder(String openid,String orderId);
}
