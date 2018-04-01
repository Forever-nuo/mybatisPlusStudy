package com.forever.mybatisPlus.controller;

import com.forever.mybatisPlus.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Forever丶诺
 * @createTime: 2018-4-2.0:05
 */
@Controller
@RequestMapping("mysql")
public class MySqlInjectorController {

    @Autowired
    private PersonDao personDao;

    @RequestMapping("/deleteAll")
    public void deleteAll(){
        personDao.deleteAll();
    }
}
