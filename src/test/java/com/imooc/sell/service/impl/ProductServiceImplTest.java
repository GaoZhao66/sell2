package com.imooc.sell.service.impl;

import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.ProductInfo;
import com.imooc.sell.service.ProductService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
public class ProductServiceImplTest extends SellApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("1");
        System.out.println(productInfo.toString());
    }

    @Test
    public void findUpAll() {
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoList = productService.findAll(request);
        for (ProductInfo productInfo : productInfoList) {
            System.out.println(productInfo.toString());
        }

    }

    @Test
    public void save() {
    }
}