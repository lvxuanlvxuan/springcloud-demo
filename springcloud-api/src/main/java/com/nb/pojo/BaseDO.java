package com.nb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 13:47
 * @Version: 1.0
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseDO {

    private String createdBy;
    private String updatedBy;
    private LocalDateTime createdTime=LocalDateTime.now();
    private LocalDateTime updatedTime=LocalDateTime.now();
}
