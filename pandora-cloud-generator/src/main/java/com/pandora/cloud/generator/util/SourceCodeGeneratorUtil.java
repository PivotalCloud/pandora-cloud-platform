package com.pandora.cloud.generator.util;

/**
 * <p>封装Qicloud项目SourceCodeGeneratorUtil类.<br></p>
 * <p>//TODO...<br></p>
 *
 * @author Powered by marklin 2021-06-02 21:19
 * @version 1.0.0
 * <p>Copyright © 2018-2021 Pivotal Cloud Technology Systems Incorporated. All rights reserved.<br></p>
 */
public class SourceCodeGeneratorUtil {
    public final String CRUD_PREFIX = "export const tableOption =";

    private final String ENTITY_JAVA_VM = "Entity.java.vm";

    private final String MAPPER_JAVA_VM = "Mapper.java.vm";

    private final String SERVICE_JAVA_VM = "Service.java.vm";

    private final String SERVICE_IMPL_JAVA_VM = "ServiceImpl.java.vm";

    private final String CONTROLLER_JAVA_VM = "Controller.java.vm";

    private final String MAPPER_XML_VM = "Mapper.xml.vm";

    private final String MENU_SQL_VM = "menu.sql.vm";

    private final String AVUE_INDEX_VUE_VM = "avue/index.vue.vm";

    private final String ELE_INDEX_VUE_VM = "element/index.vue.vm";

    private final String ELE_ADD_UPDATE_VUE_VM = "element/form.vue.vm";

    private final String AVUE_API_JS_VM = "avue/api.js.vm";

    private final String AVUE_CRUD_JS_VM = "avue/crud.js.vm";
}
