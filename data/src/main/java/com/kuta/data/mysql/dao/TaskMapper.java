/**
 * copyright (c) 2020 Kuta Service Framework
 * @author: mybatis generator
 */
package com.kuta.data.mysql.dao;

import com.kuta.data.mysql.pojo.Task;
import com.kuta.data.mysql.pojo.TaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    long countByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int deleteByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int deleteByPrimaryKey(Long tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int insert(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int insertSelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    List<Task> selectByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    Task selectByPrimaryKey(Long tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int updateByPrimaryKeySelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int updateByPrimaryKey(Task record);

    /**
     * 这是Mybatis Generator拓展插件生成的方法(请勿删除).
     * This method corresponds to the database table BS_Task
     *
     * @mbg.generated
     * @author hewei
     */
    int batchInsert(@Param("list") List<Task> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BS_Task
     * @date 2021-07-15 12:55:28
     */
    int batchUpdate(@Param("recordList") List<Task> recordList);
}