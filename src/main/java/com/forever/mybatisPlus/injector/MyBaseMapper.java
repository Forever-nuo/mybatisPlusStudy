package com.forever.mybatisPlus.injector;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * @author: Forever丶诺
 * @createTime: 2018-4-2.0:35
 */
public interface MyBaseMapper<T> extends BaseMapper<T> {
     /**
      * 删除全部表的数据
      * @return
      */
     int deleteAll();
}
