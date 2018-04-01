package com.forever.mybatisPlus.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.forever.mybatisPlus.model.Person;
import com.forever.mybatisPlus.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 获得分页数据
 *
 * @author: Forever丶诺
 * @createTime: 2018-4-1.9:10
 */
@Controller
@RequestMapping("page")
public class PageController {


    @Autowired
    private PageService pageService;

    /**
     * 前端传过来 当前页和每页显示的个数
     */
    @RequestMapping("/getPageData")
    @ResponseBody
    public Page getPageData(Page page) {
        pageService.getPageData(page);
        return  page;
    }



    /**
     * 前端传过来 从mapper文件获取数据
     */
    @RequestMapping("/getPageDataFromXm")
    @ResponseBody
    public Page getPageDataFromXm(Page page) {
        pageService.getPageDataFromXm(page);
        return  page;
    }


    /**
     * 前端传过来 当前页和每页显示的个数
     */
    @RequestMapping("/getPageDataByPageHelper")
    @ResponseBody
    public Page getPageDataByPageHelper(Page page) {
        /**
         * PageHelper对象的使用
         * 封装了Pagination对象 包含了分页参数
         *
         */
        //startPage(参数1:当前页,参数2:每页显示的个数);
        PageHelper.startPage(page.getCurrent(),page.getSize());
        List<Person> personList = pageService.getPageDataByPageHelper();
        long total = PageHelper.getTotal();
        System.out.println(total);
        //获取分页数据 对象
        Pagination pagination = PageHelper.getPagination();
        return  page;
    }
}
