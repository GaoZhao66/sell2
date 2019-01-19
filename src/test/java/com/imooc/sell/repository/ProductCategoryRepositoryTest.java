package com.imooc.sell.repository;

import com.imooc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(8);
        productCategory.setCategoryName("男生最爱");
        productCategory.setCategoryType(5);
        repository.save(productCategory);
    }

    @Test
    public void findCategoryList(){
        List<ProductCategory> catetgryList = repository.findByCategoryTypeIn(Arrays.asList(1,2,3));
        for (ProductCategory category: catetgryList) {
            System.out.println(category.toString());
        }
        Assert.assertNotEquals(0,catetgryList.size());
    }


}