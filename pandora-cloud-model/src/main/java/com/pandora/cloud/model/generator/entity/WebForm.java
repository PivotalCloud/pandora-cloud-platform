package com.pandora.cloud.model.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pandora.cloud.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>封装Qicloud项目WebFormConfig类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2021-06-02 20:57
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Data
@TableName("t_web_form")
@EqualsAndHashCode(callSuper = true)
public class WebForm extends BaseEntity {

    private static final long serialVersionUID = 663179971228152450L;
}
