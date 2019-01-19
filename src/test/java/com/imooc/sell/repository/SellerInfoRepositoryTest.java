package com.imooc.sell.repository;

import com.imooc.sell.SellApplicationTests;
import com.imooc.sell.dataobject.SellerInfo;
import com.imooc.sell.utils.KeyUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Author gaozhao
 * @创建时间 2019/1/19
 * @描述
 **/
public class SellerInfoRepositoryTest extends SellApplicationTests {

    @Autowired
    private SellerInfoRepository repository;

//    @Test
//    public void save(){
//        SellerInfo sellerInfo  = new SellerInfo();
//        sellerInfo.setId(KeyUtil.genUniqueKey());
//        sellerInfo.setUsername("admin");
//        sellerInfo.setPassword("admin");
//        sellerInfo.setOpenid("aaaa");
//        SellerInfo sellerInfo1 = repository.save(sellerInfo);
//    }


    @Test
    public void findByOpenid() throws Exception{
        SellerInfo result = repository.findByOpenid("abc");
        System.out.println(result.toString());
    }
}