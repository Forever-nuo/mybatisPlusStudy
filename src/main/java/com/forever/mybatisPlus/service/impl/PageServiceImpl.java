package com.forever.mybatisPlus.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.forever.mybatisPlus.dao.PersonDao;
import com.forever.mybatisPlus.model.Person;
import com.forever.mybatisPlus.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author: Forever丶诺
 * @createTime: 2018-4-1.9:18
 */
@Service
public class PageServiceImpl implements PageService {

    @Autowired
    private PersonDao personDao;

    @Override
    public void getPageData(Page page) {
        String[] ascFields = {"name", "age"};
        EntityWrapper<Person> ew = new EntityWrapper<>();
        ew.orderDesc(Arrays.asList(ascFields));
        ew.orderBy("id");
        List<Person> personList = personDao.selectPage(page, ew);
        page.setRecords(personList);
    }


    @Override
    public void getPageDataFromXm(Page page) {
        //将数据 封装到page对象中
        page.setRecords(personDao.getPageDataFromXm(page, 0));
    }

    @Override
    public List<Person> getPageDataByPageHelper() {
        return personDao.selectList(new EntityWrapper<Person>());
    }
}
