package com.forever.mybatisPlus.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author Forever丶诺
 * @since 2018-04-02
 */
@Data
@Accessors(chain = true)
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    @TableField(fill = FieldFill.INSERT)
    private Integer age;

    @TableLogic
    private Integer isDelete;//逻辑删除

}
