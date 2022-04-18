package com.nb.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.nb.enums.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/21 15:54
 * @Version: 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id;
    private String productName;
    private Integer productStatus;

//    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private LocalDate createTime;

    private List<ProductDetail> details;
}
