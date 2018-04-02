package com.forever.mybatisPlus.injector;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.sql.Timestamp;

/**
 * @author Forever丶诺
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

    /**
     * 测试 user 表 name 字段为空自动填充
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        // 更多查看源码测试用例
        System.out.println("*************************");
        System.out.println("insert fill");
        System.out.println("*************************");

        //测试下划线 mybatis-plus版本2.0.9+
        Object testType = getFieldValByName("age", metaObject);
        System.out.println("age=" + testType);
        if (testType == null) {
            //mybatis-plus版本2.0.9+
            setFieldValByName("age", 3, metaObject);
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {


        //更新填充
        System.out.println("*************************");
        System.out.println("update fill");
        System.out.println("*************************");
        //mybatis-plus版本2.0.9+
        setFieldValByName("lastUpdatedDt", new Timestamp(System.currentTimeMillis()), metaObject);
    }

}