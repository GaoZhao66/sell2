package com.imooc.sell.enums;

import lombok.Data;
import lombok.Getter;


/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
@Getter
public enum ProductStatusEnum implements CodeEnum {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
