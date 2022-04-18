package com.nb.service.impl;

import com.nb.mapper.ProductDetailMapper;
import com.nb.pojo.ProductDetail;
import com.nb.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 16:36
 * @Version: 1.0
 * @Description:
 */
@Service
public class ProductDetailServiceImpl implements ProductDetailService {

    @Autowired
    ProductDetailMapper productDetailMapper;
    @Override
    public void saveBatchProductDetail(List<Integer> ids, ProductDetail detail) {
        productDetailMapper.saveBatchProductDetail(detail,ids);
    }


    @Override
    public void updateProductDetailByMap(List<Map<String, Object>> mapList) {
        productDetailMapper.updateProductDetail(mapList);
    }

    @Override
    public Integer paramTest(Integer num1,Integer num2) {
        return productDetailMapper.paramTest(num1,num2);
    }

    @Override
    public void testDeleteAndInsert(List<ProductDetail> list) {
        productDetailMapper.testDeleteAndInsert(list);
    }
}
