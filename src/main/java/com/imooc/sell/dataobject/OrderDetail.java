package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/18.
 */
@Entity
@Data
public class OrderDetail {

    @Id
    private String detailId;             //后写入
    /* 订单id*/
    private String orderId;              //后写入
    /* 商品id*/
    private String productId;            //前端传入
    /* 商品名称*/
    private String productName;
    /* 商品单价 */
    private BigDecimal productPrice;
    /* 商品数量*/
    private Integer productQuantity;     //前端传入
    /* 商品小图*/
    private String productIcon;
    /* 创建时间 */
    private Date createTime;
    /* 更新时间 */
    private Date updateTime;
}
