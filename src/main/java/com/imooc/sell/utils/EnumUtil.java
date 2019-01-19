package com.imooc.sell.utils;

import com.imooc.sell.enums.CodeEnum;

/**
 * @Author gaozhao
 * @创建时间 2019/1/16
 * @描述
 **/
public class EnumUtil {
    public static <T extends CodeEnum> T getBycode(Integer code, Class<T> enumClass){
        for (T each: enumClass.getEnumConstants()) {
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
