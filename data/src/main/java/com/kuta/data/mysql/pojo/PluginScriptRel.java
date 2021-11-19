/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table BS_Plugin_Script_Rel
 * @date 2021-11-18 12:08:30
 */
public class PluginScriptRel extends PluginScriptRelKey implements Serializable {
    /**
     * @desc 索引
     * @jdbcType SMALLINT
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    private Short index;

    /**
     * @desc 插件中对应脚本的状态
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    private String status;

    /**
     * @desc 
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    private String backupOid;

    /**
     * @date 2021-11-18 12:08:30
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-11-18 12:08:30
     */
    public PluginScriptRel(Integer pid, Long oid, Short index, String status, String backupOid) {
        super(pid, oid);
        this.index = index;
        this.status = status;
        this.backupOid = backupOid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Script_Rel
     * @date 2021-11-18 12:08:30
     */
    public PluginScriptRel() {
        super();
    }

    /**
     * @return index : 索引
     */
    public Short getIndex() {
        return index;
    }

    /**
     * @param index : 索引
     */
    public void setIndex(Short index) {
        this.index = index;
    }

    /**
     * @return status : 插件中对应脚本的状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status : 插件中对应脚本的状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return backupOid : 
     */
    public String getBackupOid() {
        return backupOid;
    }

    /**
     * @param backupOid : 
     */
    public void setBackupOid(String backupOid) {
        this.backupOid = backupOid == null ? null : backupOid.trim();
    }
}