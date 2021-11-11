/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import com.kuta.base.annotation.PrimaryKey;
import com.kuta.base.database.KutaDBEntity;
import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table BS_Plugin_Param_Template
 * @date 2021-08-22 14:53:49
 */
public class PluginParamTemplate extends KutaDBEntity implements Serializable {
    /**
     * @desc 插件参数模板编号
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    @PrimaryKey
    private Integer pptid;

    /**
     * @desc 插件编号
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private Integer pid;

    /**
     * @desc 参数键
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String key;

    /**
     * @desc 类型名称
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String type;

    /**
     * @desc 默认值
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String defaultVal;

    /**
     * @desc 相关说明
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String remark;

    /**
     * @desc 参数归类
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private Integer classify;

    /**
     * @date 2021-08-22 14:53:49
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-08-22 14:53:49
     */
    public PluginParamTemplate(Integer pptid, Integer pid, String key, String type, String defaultVal, String remark, Integer classify) {
        this.pptid = pptid;
        this.pid = pid;
        this.key = key;
        this.type = type;
        this.defaultVal = defaultVal;
        this.remark = remark;
        this.classify = classify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Param_Template
     * @date 2021-08-22 14:53:49
     */
    public PluginParamTemplate() {
        super();
    }

    /**
     * @return pptid : 插件参数模板编号
     */
    public Integer getPptid() {
        return pptid;
    }

    /**
     * @param pptid : 插件参数模板编号
     */
    public void setPptid(Integer pptid) {
        this.pptid = pptid;
    }

    /**
     * @return pid : 插件编号
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid : 插件编号
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return key : 参数键
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key : 参数键
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * @return type : 类型名称
     */
    public String getType() {
        return type;
    }

    /**
     * @param type : 类型名称
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return defaultVal : 默认值
     */
    public String getDefaultVal() {
        return defaultVal;
    }

    /**
     * @param defaultVal : 默认值
     */
    public void setDefaultVal(String defaultVal) {
        this.defaultVal = defaultVal == null ? null : defaultVal.trim();
    }

    /**
     * @return remark : 相关说明
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark : 相关说明
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return classify : 参数归类
     */
    public Integer getClassify() {
        return classify;
    }

    /**
     * @param classify : 参数归类
     */
    public void setClassify(Integer classify) {
        this.classify = classify;
    }
}