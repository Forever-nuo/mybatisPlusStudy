package com.forever.mybatisPlus.controller;

import com.forever.mybatisPlus.model.Teacher;
import com.forever.mybatisPlus.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Forever丶诺
 * @date 2018/4/2 9:49
 */
@Controller
@RequestMapping("metaObjectHandler")
public class MetaObjectHandlerController {

    @Autowired
    private TeacherService teacherService;


    /**
     * @param :
     * @Description: 没有设置age值
     * @Author: Forever丶诺
     * @Date: 10:07 2018/4/2
     */
    @RequestMapping("/insert")
    public void insert(){
        teacherService.insert(new Teacher().setName("王五"));
    }

}
