package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author gaozhao
 * @创建时间 2019/1/9
 * @描述
 **/
public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    //按照买家的openId来查
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);

}
