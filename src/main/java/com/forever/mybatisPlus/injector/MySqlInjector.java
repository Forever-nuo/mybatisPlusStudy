package com.forever.mybatisPlus.injector;

import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.mapper.AutoSqlInjector;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;


/**
 * @author Administrator
 *
 *
 */
public class MySqlInjector extends AutoSqlInjector {

    /**
     * 自定义覆盖的方法
     * @Description:
     * @Author: Forever丶诺
     * @Date: 9:19 2018/4/2
     */
    @Override
    public void inject(Configuration configuration, MapperBuilderAssistant builderAssistant, Class<?> mapperClass,
                       Class<?> modelClass, TableInfo table) {
        /* 添加一个自定义方法 */
        deleteAll(mapperClass, modelClass, table);
    }

    /**
     * 添加对应的定义接口方法
     * @param mapperClass
     * @param modelClass
     * @param table
     */
    public void deleteAll(Class<?> mapperClass, Class<?> modelClass, TableInfo table) {
        /* 执行 SQL ，动态 SQL 参考类 SqlMethod */
        String sql = "delete from " + table.getTableName();
        /* mapper 接口方法名一致 */
        String method = "deleteAll";
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
       this.addDeleteMappedStatement(mapperClass,method,sqlSource);
    }

}