package com.forever.mybatisPlus.controller;


import com.forever.mybatisPlus.model.Person;
import com.forever.mybatisPlus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 增删改查的操作
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Forever丶诺
 * @since 2018-03-31
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    /**
     * 添加一个Bean
     */
    @RequestMapping("/addOne")
    public void addPerson() {
        Person person = new Person().setAge(12).setName("王五");
        System.out.println(111);
        personService.insert(person);

        System.out.println(person);


    }

}

