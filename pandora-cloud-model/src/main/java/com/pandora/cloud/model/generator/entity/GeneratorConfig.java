package com.pandora.cloud.model.generator.entity;

import lombok.Data;

/**
 * <p>封装Qicloud项目GeneratorConfig类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2021-06-02 20:39
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Data
public class GeneratorConfig {
    /**
     * 数据源name
     */
    private String dsName;

    /**
     * 包名
     */
    private String packageName;

    /**
     * 作者
     */
    private String author;

    /**
     * 模块名称
     */
    private String moduleName;

    /**
     * 表前缀
     */
    private String tablePrefix;

    /**
     * 表名称
     */
    private String tableName;

    /**
     * 表备注
     */
    private String comments;

    /**
     * 代码风格 0 - avue 1 - element
     */
    private String style;
}
