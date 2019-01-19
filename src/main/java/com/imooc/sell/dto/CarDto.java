package com.imooc.sell.dto;

import lombok.Data;

/**
 * @Author gaozhao
 * @创建时间 2019/1/10
 * @描述 购物车
 **/
@Data
public class CarDto {

    /* 商品ID*/
    private String productId;
    /* 数量 */
    private Integer productQuantity;

    public CarDto(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
