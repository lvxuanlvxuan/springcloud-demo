package com.nb.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 9:47
 * @Version: 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductVO {

    @JsonProperty(value = "status" , defaultValue = "1")
    private Integer status;

    private Integer id;
}
