package com.imooc.sell.service.impl;

import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.dto.OrderDto;
import com.imooc.sell.repository.OrderDetailRepository;
import com.imooc.sell.repository.OrderMasterRepository;
import com.imooc.sell.service.OrderService;
import com.imooc.sell.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author gaozhao
 * @创建时间 2019/1/10
 * @描述
 **/
public class OrderServiceImplTest extends SellApplicationTests {

    @Autowired
    private OrderService orderService;


    private final String OPENID = "110110";

//    @Test
//    public void create() {
//
//        OrderDto orderDto = new OrderDto();
//        orderDto.setBuyerName("赵雷");
//        orderDto.setBuyerAddress("北京市西城区");
//        orderDto.setBuyerPhone("15011111111");
//        orderDto.setBuyerOpenid(OPENID);
//
//        //购物车
//        List<OrderDetail> orderDetailList = new ArrayList<OrderDetail>();
//
//        OrderDetail o1 = new OrderDetail();
//        o1.setProductId("4");
//        o1.setProductQuantity(1);
//
//        orderDetailList.add(o1);
//
//        orderDto.setOrderDetailList(orderDetailList);
//        OrderDto result = orderService.create(orderDto);
//        System.out.println("[创建订单] result={}" + result);
//    }

    @Test
    public void list(){
        PageRequest request = new PageRequest(0,2);
        Page<OrderDto> orderDtoPage = orderService.findList(request);
        Assert.assertNotEquals(0,orderDtoPage.getTotalElements());
    }




}