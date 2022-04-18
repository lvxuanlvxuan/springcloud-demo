package com.nb.controller;

import com.nb.VO.ProductVO;
import com.nb.VO.TestUrlVO;
import com.nb.pojo.Product;
import com.nb.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/21 21:50
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/getOne")
    public Product getOne(@RequestParam("id") Integer id,
                          @RequestParam("sales")BigDecimal sales){
        Product product = productService.getOne(id,sales);
        return product;
    }

    @PostMapping("/saveOneProduct")
    public Integer saveOneProduct(@RequestBody Product product){

        log.info(product.toString());
        int i=productService.saveOneProduct(product);
        log.info(product.getId().toString());
        return product.getId();
    }

    @PostMapping("/saveBatchProduct")
    public List<Integer> saveBatchProduct(@RequestBody List<Product> products){

        if(CollectionUtils.isEmpty(products)){
            return new ArrayList<>();
        }
        productService.saveBatchProduct(products);

//        List<Integer> collect = products.stream().map(Product::getId).collect(Collectors.toList());

        return new ArrayList<>();
    }

    @PostMapping("/findProductInfo")
    public Product findProductInfo(@RequestBody ProductVO vo){
        return productService.findProductInfo(vo);
    }

    @GetMapping("/rangeQuery")
    public List<Product> rangeQuery(@RequestParam("ids") List<Integer> ids){
        return productService.rangeQuery(ids);
    }


    @PostMapping("/batchUpdateProductV1")
    public void batchUpdateProductV1(@RequestBody List<Product> products){
        productService.batchUpdateProductV1(products);
    }

    @PostMapping("/batchUpdateProductV2")
    public void batchUpdateProductV2(@RequestBody List<Product> products){
        productService.batchUpdateProductV2(products);
    }

    @PostMapping("/testUrl")
    public void testUrl(@RequestBody TestUrlVO testUrlVO){

        System.out.println(testUrlVO);
    }

    @GetMapping("/param")
    public void testParam(String param){
        System.out.println(param);
    }


}
