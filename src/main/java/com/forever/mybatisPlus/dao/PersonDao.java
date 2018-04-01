package com.forever.mybatisPlus.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.forever.mybatisPlus.model.Person;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Forever丶诺
 * @since 2018-03-31
 */
public interface PersonDao extends BaseMapper<Person> {


    /**
     * 从xml获取分页数据
     * 会自动将分页数据封装到page对象中
     * @param page : page属性不需要param注解
     * @param age
     * @return
     */
    List<Person> getPageDataFromXm(Page page, Integer age);

}
