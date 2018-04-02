package com.forever.mybatisPlus.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.forever.mybatisPlus.dao.TeacherDao;
import com.forever.mybatisPlus.enums.AgeEnum;
import com.forever.mybatisPlus.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Forever丶诺
 * @date 2018/4/2 15:10
 */
@Controller
@RequestMapping("enum")
public class EnumController {

    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping("/insert")
    public void insert() {
        teacherDao.insert(new Teacher().setAge(1).setAgeEnum(AgeEnum.ONE));
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Teacher> selectAll() {
        List<Teacher> teachers = teacherDao.selectList(new EntityWrapper<Teacher>());
        return teachers;
    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/getDataById")
    @ResponseBody
    public List<Teacher> getDataById(Teacher teacher) {
        System.out.println(teacher);
        return null;
    }

}
