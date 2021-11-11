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
 * This class corresponds to the database table BS_Config
 * @date 2021-08-22 14:53:49
 */
public class SystemConfig extends KutaDBEntity implements Serializable {
    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    @PrimaryKey
    private String key;

    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String value;

    /**
     * @desc 默认值
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String defaultVal;

    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String remark;

    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-08-22 14:53:49
     */
    private String valType;

    /**
     * @date 2021-08-22 14:53:49
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-08-22 14:53:49
     */
    public SystemConfig(String key, String value, String defaultVal, String remark, String valType) {
        this.key = key;
        this.value = value;
        this.defaultVal = defaultVal;
        this.remark = remark;
        this.valType = valType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-08-22 14:53:49
     */
    public SystemConfig() {
        super();
    }

    /**
     * @return key : 
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key : 
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * @return value : 
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value : 
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
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
     * @return remark : 
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark : 
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return valType : 
     */
    public String getValType() {
        return valType;
    }

    /**
     * @param valType : 
     */
    public void setValType(String valType) {
        this.valType = valType == null ? null : valType.trim();
    }
}