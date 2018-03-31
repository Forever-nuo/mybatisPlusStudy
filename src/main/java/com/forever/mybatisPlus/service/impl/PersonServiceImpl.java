package com.forever.mybatisPlus.service.impl;

import com.forever.mybatisPlus.model.Person;
import com.forever.mybatisPlus.dao.PersonDao;
import com.forever.mybatisPlus.service.PersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Forever丶诺
 * @since 2018-03-31
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonDao, Person> implements PersonService {

    @Autowired
    private PersonDao personDao;
}
