package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    //通过类目的集合来查所有
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
