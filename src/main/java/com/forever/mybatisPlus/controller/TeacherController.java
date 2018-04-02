package com.forever.mybatisPlus.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import com.forever.mybatisPlus.service.TeacherService;


import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Forever丶诺
 * @since 2018-04-02
 */
@Controller
@RequestMapping("teacher")
public class TeacherController {
    @Autowired
    private TeacherService  teacherService ;


    @RequestMapping("/deleteAll")
    public void deleteAll(){
        teacherService.deleteAll();

    }

}

