package com.imooc.sell.form;

import lombok.Data;

/**
 * Created by Administrator on 2018/5/31.
 */
@Data
public class CategoryForm {

    private Integer categoryId;
    /*类目名字*/
    private String categoryName;
    /*类目编号*/
    private Integer categoryType;
}
