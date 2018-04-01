package com.forever.mybatisPlus.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.forever.mybatisPlus.model.Person;

import java.util.List;

/**
 * @author: Forever丶诺
 * @createTime: 2018-4-1.9:11
 */
public interface PageService {


    /**
     * 获得分页数据
     *
     * @param page
     */
    void getPageData(Page page);


    /**
     * 从xml获取分页数据
     * @param page
     */
    void getPageDataFromXm(Page page);


    /**
     *  使用PageHelper对象
     * @return  获得查询数据
     */
    List<Person> getPageDataByPageHelper();
}
