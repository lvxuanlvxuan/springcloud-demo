package com.nb.service;

import com.nb.VO.ProductVO;
import com.nb.pojo.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/21 21:48
 * @Version: 1.0
 * @Description:
 */
public interface ProductService {

    Product getOne(Integer id, BigDecimal sales);

    Integer saveOneProduct(Product product);

    void saveBatchProduct(List<Product> products);

    Product findProductInfo(ProductVO vo);

    List<Product> rangeQuery(List<Integer> ids);

    void batchUpdateProductV1(List<Product> products);

    void batchUpdateProductV2(List<Product> products);

}
