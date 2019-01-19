package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.dto.CarDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
public interface ProductService {

    /**根据产品id来查询*/
    ProductInfo findOne(String productId);

    /**查询所有在架商品*/
    List<ProductInfo> findUpAll();

    /**查询所有商品 因为需要分页所以传入 Pageable 参数*/
    Page<ProductInfo> findAll(Pageable pageable);

    /**保存商品*/
    ProductInfo save(ProductInfo productInfo);

    /**加库存*/
    void increaseStock(List<CarDto> carDtoList);

    /**减库存*/
     void decreaseStock(List<CarDto> carDtoList);

     /**上架*/
     ProductInfo onSale(String productId);

     /**下架*/
     ProductInfo offSale(String productId);

}
