package com.imooc.sell.enums;

import lombok.Getter;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
@Getter
public enum PayStatusEnum implements CodeEnum{

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");


    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
