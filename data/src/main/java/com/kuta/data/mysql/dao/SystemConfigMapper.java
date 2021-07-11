/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.SystemConfig;
import com.kuta.data.mysql.pojo.SystemConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    long countByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int deleteByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int deleteByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int insert(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int insertSelective(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    List<SystemConfig> selectByExample(SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    SystemConfig selectByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int updateByExampleSelective(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int updateByExample(@Param("record") SystemConfig record, @Param("example") SystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int updateByPrimaryKeySelective(SystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int updateByPrimaryKey(SystemConfig record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Config
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<SystemConfig> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Config
     * @date 2021-07-09 21:55:39
     */
    int batchUpdate(@Param("recordList") List<SystemConfig> recordList);
}