package com.nb.service;

import com.nb.pojo.ProductDetail;

import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 16:35
 * @Version: 1.0
 * @Description:
 */
public interface ProductDetailService {

    void saveBatchProductDetail(List<Integer> ids, ProductDetail detail);

    void updateProductDetailByMap(List<Map<String,Object>> mapList);

    Integer paramTest(Integer num1,Integer num2);

    void testDeleteAndInsert(List<ProductDetail> list);
}
