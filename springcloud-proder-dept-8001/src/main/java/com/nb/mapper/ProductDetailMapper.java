package com.nb.mapper;

import com.nb.pojo.ProductDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 16:25
 * @Version: 1.0
 * @Description:
 */
@Repository
public interface ProductDetailMapper {

    void saveBatchProductDetail(@Param("detail") ProductDetail productDetail,
                                @Param("ids") List<Integer> ids);

    void updateProductDetail(@Param("mapList")List<Map<String,Object>> mapList);

    Integer paramTest(@Param("num1") Integer num,
                      @Param("num2") Integer num2);

    void testDeleteAndInsert(@Param("list") List<ProductDetail>list);
}
