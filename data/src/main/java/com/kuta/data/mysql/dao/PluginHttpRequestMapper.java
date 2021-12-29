/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.PluginHttpRequest;
import com.kuta.data.mysql.pojo.PluginHttpRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PluginHttpRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    long countByExample(PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int deleteByExample(PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int deleteByPrimaryKey(Long phrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int insert(PluginHttpRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int insertSelective(PluginHttpRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    List<PluginHttpRequest> selectByExample(PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    PluginHttpRequest selectByPrimaryKey(Long phrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int updateByExampleSelective(@Param("record") PluginHttpRequest record, @Param("example") PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int updateByExample(@Param("record") PluginHttpRequest record, @Param("example") PluginHttpRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int updateByPrimaryKeySelective(PluginHttpRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int updateByPrimaryKey(PluginHttpRequest record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Plugin_Http_Request
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<PluginHttpRequest> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int updateWithOptimisticLock(PluginHttpRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Plugin_Http_Request
     * @date 2021-12-28 00:51:29
     */
    int batchUpdate(@Param("recordList") List<PluginHttpRequest> recordList);
}