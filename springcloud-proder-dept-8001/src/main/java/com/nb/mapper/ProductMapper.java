package com.nb.mapper;

import com.nb.VO.ProductVO;
import com.nb.annotation.SendMq;
import com.nb.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/21 15:56
 * @Version: 1.0
 * @Description:
 */
@Repository
public interface ProductMapper {

    Product getOne(@Param("id") Integer id);

    List<Product> rangeQuery(@Param("ids") List<Integer> ids);

    @SendMq(description = "向异常日志表插入数据 同时发送mq")
    Integer saveOneProduct(Product product);

    void saveBatchProduct(@Param("list") List<Product> products);

    Product findProductInfo(ProductVO vo);

    void batchUpdateProductV1(@Param("list") List<Product> products);

    void batchUpdateProductV2(@Param("list") List<Product> products);
}
