package com.nb.handler.enumTypeHandler;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.nb.service.BaseEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Author: nb
 * @program:
 * @Date: 2021/5/22 22:02
 * @Version: 1.0
 * @Description:
 */
@MappedTypes({BaseEnum.class})
@MappedJdbcTypes({JdbcType.INTEGER})
public class BaseEnumTypeHandler<E extends BaseEnum> extends BaseTypeHandler<BaseEnum> {

    private Class<E> clazz;

    public BaseEnumTypeHandler(Class<E> enumType){
        if(enumType==null){
            throw new IllegalArgumentException("type argument cannot be null");
        }
        this.clazz=enumType;
    }


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, BaseEnum baseEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,baseEnum.getId());
    }

    @Override
    public BaseEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return getByType(resultSet.getInt(s));
    }

    @Override
    public BaseEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getByType(resultSet.getInt(i));
    }

    @Override
    public BaseEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getByType(callableStatement.getInt(i));
    }

    private BaseEnum getByType(int anInt) {
        final E[] enumConstants = clazz.getEnumConstants();
        for (BaseEnum enums : enumConstants) {
            if (enums.getId() == anInt) {
                return enums;
            }
        }
        return null;
    }
}
