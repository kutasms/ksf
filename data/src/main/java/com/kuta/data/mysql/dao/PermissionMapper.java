/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.Permission;
import com.kuta.data.mysql.pojo.PermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    long countByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int deleteByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int deleteByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int insert(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int insertSelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    List<Permission> selectByExample(PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    Permission selectByPrimaryKey(Integer pid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int updateByExampleSelective(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int updateByExample(@Param("record") Permission record, @Param("example") PermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int updateByPrimaryKeySelective(Permission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int updateByPrimaryKey(Permission record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Permission
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<Permission> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Permission
     * @date 2021-08-22 14:53:49
     */
    int batchUpdate(@Param("recordList") List<Permission> recordList);
}