package com.pandora.cloud.model.generator.entity;

import lombok.Data;

import java.util.List;

/**
 * <p>封装Qicloud项目TableEntity类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2021-06-02 20:37
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
@Data
public class TableEntity {
    /**
     * 名称
     */
    private String tableName;

    /**
     * 备注
     */
    private String comments;

    /**
     * 主键
     */
    private ColumnEntity pk;

    /**
     * 列名
     */
    private List<ColumnEntity> columns;

    /**
     * 驼峰类型
     */
    private String caseClassName;

    /**
     * 普通类型
     */
    private String lowerClassName;

    /**
     * 数据库类型 （用于根据数据库个性化）
     */
    private String dbType;
}
