package com.imooc.sell.converter;

import com.imooc.sell.dataobject.OrderMaster;
import com.imooc.sell.dto.OrderDto;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author gaozhao
 * @创建时间 2019/1/10
 * @描述
 **/
public class OrderMaster2OrderDTOConverter {

    public static OrderDto convert(OrderMaster orderMaster){
        OrderDto orderDTO = new OrderDto();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;
    }

    public  static List<OrderDto> convert(List<OrderMaster> orderMasterList){
        return orderMasterList.stream().map(e ->
                convert(e)
        ).collect(Collectors.toList());
    }
}
