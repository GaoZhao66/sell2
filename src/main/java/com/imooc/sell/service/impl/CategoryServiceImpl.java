package com.imooc.sell.service.impl;

import com.imooc.sell.dataobject.ProductCategory;
import com.imooc.sell.repository.ProductCategoryRepository;
import com.imooc.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述 类目
 **/
@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    ProductCategoryRepository repository;

    /**根据类别id 来查询*/
    public ProductCategory findOne(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    /**查询所有*/
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    /**根据类别的集合来查*/
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    /**新增*/
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
