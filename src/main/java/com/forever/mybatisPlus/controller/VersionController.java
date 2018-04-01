package com.forever.mybatisPlus.controller;

import com.forever.mybatisPlus.model.Person;
import com.forever.mybatisPlus.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: Forever丶诺
 * @createTime: 2018-4-1.22:29
 */
@Controller
@RequestMapping("version")
public class VersionController {

    @Autowired
    private PersonService personService;

    /**
     * 乐观锁的演示
     * 添加一个版本字段
     * 添加@version 注解
     * 原理 update 表名 set version = 3 where id = xx and version =3 ;
     *
     * @param :
     * @Description:
     * @Author: Forever丶诺
     * @Date: 23:02 2018-4-1
     */
    @RequestMapping("/updateVersion")
    public void updateVersion() {

        Person person = personService.selectById("980459519777918978").setAge(15);
        if (personService.updateById(person)) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败");
        }

    }

}
