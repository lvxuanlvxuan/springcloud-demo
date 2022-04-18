package com.nb.service.impl;

import com.nb.VO.ProductVO;
import com.nb.mapper.ProductMapper;
import com.nb.pojo.Product;
import com.nb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/21 21:49
 * @Version: 1.0
 * @Description:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public Product getOne(Integer id, BigDecimal sales) {
        System.out.println("11");
        Product product = productMapper.getOne(id);
        return product;
    }

    @Override
    public Integer saveOneProduct(Product product) {
        return productMapper.saveOneProduct(product);
    }

    @Override
    public void saveBatchProduct(List<Product> products) {
        productMapper.saveBatchProduct(products);
    }

    @Override
    public Product findProductInfo(ProductVO vo) {
        return productMapper.findProductInfo(vo);
    }

    @Override
    public List<Product> rangeQuery(List<Integer> ids) {
        return productMapper.rangeQuery(ids);
    }

    @Override
    public void batchUpdateProductV1(List<Product> products) {
        productMapper.batchUpdateProductV1(products);
    }

    @Override
    public void batchUpdateProductV2(List<Product> products) {
        productMapper.batchUpdateProductV2(products);
    }


}
