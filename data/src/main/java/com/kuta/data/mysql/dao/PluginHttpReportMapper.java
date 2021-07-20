/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.PluginHttpReport;
import com.kuta.data.mysql.pojo.PluginHttpReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginHttpReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    long countByExample(PluginHttpReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int deleteByExample(PluginHttpReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int deleteByPrimaryKey(Long phrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int insert(PluginHttpReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int insertSelective(PluginHttpReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    List<PluginHttpReport> selectByExample(PluginHttpReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    PluginHttpReport selectByPrimaryKey(Long phrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int updateByExampleSelective(@Param("record") PluginHttpReport record, @Param("example") PluginHttpReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int updateByExample(@Param("record") PluginHttpReport record, @Param("example") PluginHttpReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int updateByPrimaryKeySelective(PluginHttpReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int updateByPrimaryKey(PluginHttpReport record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Http_Report
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginHttpReport> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Report
     * @date 2021-07-15 12:55:28
     */
    int batchUpdate(@Param("recordList") List<PluginHttpReport> recordList);
}