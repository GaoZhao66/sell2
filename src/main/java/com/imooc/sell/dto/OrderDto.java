package com.imooc.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import com.imooc.sell.utils.EnumUtil;
import com.imooc.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)  //当返回结果为null时就不显示
public class OrderDto {

    /* 订单id */
    private String orderId;
    /* 买家名字 */
    private String buyerName;
    /* 买家手机号 */
    private String buyerPhone;
    /* 买家地址*/
    private String buyerAddress;
    /* 买家微信Openid*/
    private String buyerOpenid;
    /* 订单总金额*/
    private BigDecimal orderAmount;
    /* 订单状态，默认为新下单*/
    private Integer orderStatus;
    /* 支付状态，默认为0未支付 */
    private Integer payStatus;
    /* 创建时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    /* 更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum(){
        return EnumUtil.getBycode(orderStatus,OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum(){
        return EnumUtil.getBycode(payStatus,PayStatusEnum.class);
    }

}
