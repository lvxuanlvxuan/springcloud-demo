package com.nb.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: nb
 * @Date: 2021/4/5 20:25
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dept implements Serializable {

    private Long deptNo;

    private String deptName;

    private String deptSource;
}
