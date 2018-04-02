package com.forever.mybatisPlus.service.impl;

import com.forever.mybatisPlus.model.Teacher;
import com.forever.mybatisPlus.dao.TeacherDao;
import com.forever.mybatisPlus.service.TeacherService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.forever.mybatisPlus.dao.TeacherDao;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Forever丶诺
 * @since 2018-04-02
 */
@Service
public class TeacherServiceImpl extends ServiceImpl<TeacherDao, Teacher> implements TeacherService {

        @Autowired
        private TeacherDao  teacherDao ;

        @Override
        public void deleteAll() {
                teacherDao.deleteAll();
        }
}
