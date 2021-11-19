/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.kuta.base.annotation.PrimaryKey;
import com.kuta.base.database.KutaDBEntity;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table BS_Plugin_Org
 * @date 2021-11-18 12:08:30
 */
public class PluginOrganization extends KutaDBEntity implements Serializable {
    /**
     * @desc 
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    @PrimaryKey
    private Integer poid;

    /**
     * @desc 插件编号
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    private Integer pid;

    /**
     * @desc 组织机构编号
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    private Integer oid;

    /**
     * @desc 创建时间
     * @jdbcType TIMESTAMP
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss SSS")
    private Date created;

    /**
     * @desc 当前组织机构实例化的此插件是否已启用
     * @jdbcType BIT
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    private Boolean enable;

    /**
     * @desc 状态
     * @jdbcType VARCHAR
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    private String status;

    /**
     * @date 2021-11-18 12:08:30
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-11-18 12:08:30
     */
    public PluginOrganization(Integer poid, Integer pid, Integer oid, Date created, Boolean enable, String status) {
        this.poid = poid;
        this.pid = pid;
        this.oid = oid;
        this.created = created;
        this.enable = enable;
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-11-18 12:08:30
     */
    public PluginOrganization() {
        super();
    }

    /**
     * @return poid : 
     */
    public Integer getPoid() {
        return poid;
    }

    /**
     * @param poid : 
     */
    public void setPoid(Integer poid) {
        this.poid = poid;
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
     * @return oid : 组织机构编号
     */
    public Integer getOid() {
        return oid;
    }

    /**
     * @param oid : 组织机构编号
     */
    public void setOid(Integer oid) {
        this.oid = oid;
    }

    /**
     * @return created : 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created : 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return enable : 当前组织机构实例化的此插件是否已启用
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * @param enable : 当前组织机构实例化的此插件是否已启用
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * @return status : 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status : 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}