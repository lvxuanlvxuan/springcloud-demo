package com.nb.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.nb.service.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/21 15:51
 * @Version: 1.0
 * @Description:
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ProductStatus implements BaseEnum {

    NEW(0,"新品"),
    SELL_OUT(1,"售罄");

    private Integer code;
    private String message;

    @Override
    public Integer getId() {
        return this.code;
    }

    @JsonCreator
    public static ProductStatus findProductStatus(String code){
        for (ProductStatus value : ProductStatus.values()) {
            if(value.getCode().equals(code)){
                return value;
            }
        }
        return null;
    }

    @JsonValue
    public String jsonValue(){
        return getMessage();
    }

}
