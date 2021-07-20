/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.PluginOrganizationParam;
import com.kuta.data.mysql.pojo.PluginOrganizationParamExample;
import com.kuta.data.mysql.pojo.PluginOrganizationParamKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginOrganizationParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    long countByExample(PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int deleteByExample(PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int deleteByPrimaryKey(PluginOrganizationParamKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int insert(PluginOrganizationParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int insertSelective(PluginOrganizationParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    List<PluginOrganizationParam> selectByExample(PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    PluginOrganizationParam selectByPrimaryKey(PluginOrganizationParamKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int updateByExampleSelective(@Param("record") PluginOrganizationParam record, @Param("example") PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int updateByExample(@Param("record") PluginOrganizationParam record, @Param("example") PluginOrganizationParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int updateByPrimaryKeySelective(PluginOrganizationParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int updateByPrimaryKey(PluginOrganizationParam record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Org_Param
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginOrganizationParam> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Org_Param
     * @date 2021-07-15 12:55:28
     */
    int batchUpdate(@Param("recordList") List<PluginOrganizationParam> recordList);
}