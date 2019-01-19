package com.imooc.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.imooc.sell.enums.ProductStatusEnum;
import com.imooc.sell.utils.EnumUtil;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2018/4/13.
 * 商品表
 */
@Entity
@Data
@DynamicUpdate//如果需要修改时间自动更新的情况下
public class ProductInfo {

    @Id
    private  String productId;
    /* 名字 */
    private  String productName;
    /* 单价 */
    private BigDecimal productPrice;
    /* 库存 */
    private Integer productStock;
    /* 描述 */
    private String productDescription;
    /* 小图 */
    private String productIcon;
    /* 状态，0正常1下架*/
    private Integer productStatus = ProductStatusEnum.UP.getCode();
    /* 类目编号*/
    private Integer categoryType;
    /*创建时间*/
    private Date createTime;
    /*更新时间*/
    private Date updateTime;

    @JsonIgnore
    public ProductStatusEnum getProductStatusEnum(){
        return EnumUtil.getBycode(productStatus,ProductStatusEnum.class);
    }

//    @JsonIgnore
//    public ProductStatusEnum getProductStatusEnum(){
//        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
//    }

}
