package com.nb.handler.enumTypeHandler;

import com.nb.enums.ProductStatus;
import org.apache.ibatis.type.MappedTypes;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/23 10:23
 * @Version: 1.0
 * @Description:
 */
@MappedTypes({ProductStatus.class})
public class ProductStatusHandler extends BaseEnumTypeHandler<ProductStatus>{
    public ProductStatusHandler(Class<ProductStatus> enumType) {
        super(enumType);
    }
}
