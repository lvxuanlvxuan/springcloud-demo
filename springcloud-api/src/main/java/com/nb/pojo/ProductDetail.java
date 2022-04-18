package com.nb.pojo;

import lombok.*;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 16:13
 * @Version: 1.0
 * @Description:
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetail {

    private Integer id;
    private Integer productId;
    private String image;
    private String doc ;
}
