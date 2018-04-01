package com.forever.mybatisPlus.controller;

import com.forever.mybatisPlus.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Forever丶诺
 * @createTime: 2018-4-1.23:14
 */
@Controller
@RequestMapping("plug")
public class PlugController {
    @Autowired
    private PersonDao personDao;

    @ResponseBody
    @RequestMapping("/fresh")
    public void fresh() {
        personDao.freshXmlData();
    }
}
