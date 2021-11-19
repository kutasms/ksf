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
 * This class corresponds to the database table BS_UserRoleRel
 * @date 2021-11-18 12:08:30
 */
public class UserRoleRelKey extends KutaDBEntity implements Serializable {
    /**
     * @desc 
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    @PrimaryKey
    private Integer uid;

    /**
     * @desc 
     * @jdbcType INTEGER
     * @author mybatis generator
     * @date 2021-11-18 12:08:30
     */
    @PrimaryKey
    private Integer rid;

    /**
     * @date 2021-11-18 12:08:30
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-11-18 12:08:30
     */
    public UserRoleRelKey(Integer uid, Integer rid) {
        this.uid = uid;
        this.rid = rid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_UserRoleRel
     * @date 2021-11-18 12:08:30
     */
    public UserRoleRelKey() {
        super();
    }

    /**
     * @return uid : 
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid : 
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return rid : 
     */
    public Integer getRid() {
        return rid;
    }

    /**
     * @param rid : 
     */
    public void setRid(Integer rid) {
        this.rid = rid;
    }
}