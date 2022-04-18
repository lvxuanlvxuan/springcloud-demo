package com.nb.controller;

import com.nb.pojo.ProductDetail;
import com.nb.service.ProductDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 16:38
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/productDetail")
public class ProductDetailController {

    @Autowired
    ProductDetailService productDetailService;

    @PostMapping("/saveBatchProductDetail")
    public void saveBatchProductDetail(@RequestBody ProductDetail detail){
        productDetailService.saveBatchProductDetail(new ArrayList<>(Arrays.asList(1,1)),detail);
    }

    @GetMapping("/updateByMap")
    public void updateByMap(){
        List<Map<String,Object>> mapList=new ArrayList<>();
        Map<String,Object> map1=new HashMap<>();
        map1.put("doc","dello");
        List<String> list=new ArrayList<>(Arrays.asList("www.baidu.com","www.jingdong.com"));
        map1.put("images",list);
        mapList.add(map1);

        productDetailService.updateProductDetailByMap(mapList);
    }

    @GetMapping("/paramTest")
    public Integer paramTest(@RequestParam("num1") Integer num1,
                             @RequestParam("num2") Integer num2){
       return productDetailService.paramTest(num1,num2);
    }

    @PostMapping("/testDeleteAndInsert")
    public void testDeleteAndInsert(@RequestBody List<ProductDetail> details){
        productDetailService.testDeleteAndInsert(details);
    }
}
