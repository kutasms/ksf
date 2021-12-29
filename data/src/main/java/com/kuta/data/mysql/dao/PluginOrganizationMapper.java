/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.PluginOrganization;
import com.kuta.data.mysql.pojo.PluginOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    long countByExample(PluginOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int deleteByExample(PluginOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int deleteByPrimaryKey(Integer poid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int insert(PluginOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int insertSelective(PluginOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    List<PluginOrganization> selectByExample(PluginOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    PluginOrganization selectByPrimaryKey(Integer poid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int updateByExampleSelective(@Param("record") PluginOrganization record, @Param("example") PluginOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int updateByExample(@Param("record") PluginOrganization record, @Param("example") PluginOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int updateByPrimaryKeySelective(PluginOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int updateByPrimaryKey(PluginOrganization record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Org
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginOrganization> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int updateWithOptimisticLock(PluginOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org
     * @date 2021-12-28 00:51:29
     */
    int batchUpdate(@Param("recordList") List<PluginOrganization> recordList);
}