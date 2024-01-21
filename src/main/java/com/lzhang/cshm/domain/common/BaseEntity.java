package com.lzhang.cshm.domain.common;

import java.io.Serializable;
import java.util.Date;

/**
 * @author:lizhihang
 * @date: 2024/1/19 12:43
 * @description: 用于实现实体类的通用属性和方法
 */


public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;        // 唯一标识符
    private Date create_time; // 创建时间
    private Date update_time; // 更新时间

    // 构造函数、getter 和 setter 方法
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}

