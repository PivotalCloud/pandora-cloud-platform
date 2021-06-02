package com.pandora.cloud.model.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.pandora.cloud.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>封装Qicloud项目DatasourceConfig类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2021-06-02 20:50
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Data
@TableName("t_datasource_config")
@EqualsAndHashCode(callSuper = true)
public class DatasourceConfig extends BaseEntity {
    private static final long serialVersionUID = 2309860556923725186L;
}
