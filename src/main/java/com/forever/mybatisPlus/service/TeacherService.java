package com.forever.mybatisPlus.service;

import com.forever.mybatisPlus.model.Teacher;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Forever丶诺
 * @since 2018-04-02
 */
public interface TeacherService extends IService<Teacher> {

    void deleteAll();
}
