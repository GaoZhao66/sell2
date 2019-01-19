package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /**通过商品的状态来查*/
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
