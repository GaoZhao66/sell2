package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
public interface CategoryService {


    /**根据类别id 来查询*/
    ProductCategory findOne (Integer categoryId);

    /**查询所有*/
    List<ProductCategory> findAll();

    /**根据类别的集合来查*/
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**新增*/
    ProductCategory save (ProductCategory productCategory);
}
