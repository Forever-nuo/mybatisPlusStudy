package com.forever.mybatisPlus.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.forever.mybatisPlus.model.Person;
import com.forever.mybatisPlus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Forever丶诺
 * @createTime: 2018-4-1.21:34
 */
@Controller
@RequestMapping("sqlExplainInterceptor")
public class SqlExplainInterceptorController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/deleteAll")
    @ResponseBody
    public void deleteAll(){
        personService.delete(new EntityWrapper<Person>());
    }

}
