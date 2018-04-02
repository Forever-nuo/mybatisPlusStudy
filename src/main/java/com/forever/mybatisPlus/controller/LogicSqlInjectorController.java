package com.forever.mybatisPlus.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.forever.mybatisPlus.dao.TeacherDao;
import com.forever.mybatisPlus.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 逻辑删除的演示
 *
 * @author Forever丶诺
 * @date 2018/4/2 13:12
 */
@Controller
@RequestMapping("logicSqlInjector")
public class LogicSqlInjectorController {

    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping("/delete")
    public void deleteTeacher() {
        teacherDao.deleteById(Long.valueOf("980627883134910466"));
    }

    /**
     * 查询的时候也只会查询没有被软删除的
     */
    @RequestMapping("/select")
    public void select() {
     /*
    SELECT
        id,
        `name`,
        age,
        isDelete
    FROM
        teacher
    WHERE
        isDelete=0
      */
        EntityWrapper<Teacher> ew = new EntityWrapper<>();
        System.out.println(ew.getSqlSegment());
        teacherDao.selectList(ew);
    }

}
