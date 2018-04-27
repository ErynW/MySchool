package com.cdut.myschool.persist.mapper;

import com.cdut.myschool.persist.entity.JoinClass;
import com.cdut.myschool.persist.entity.JoinClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JoinClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    long countByExample(JoinClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int deleteByExample(JoinClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int insert(JoinClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int insertSelective(JoinClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    List<JoinClass> selectByExample(JoinClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    JoinClass selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") JoinClass record, @Param("example") JoinClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int updateByExample(@Param("record") JoinClass record, @Param("example") JoinClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int updateByPrimaryKeySelective(JoinClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_class
     *
     * @mbg.generated Wed Apr 25 16:30:09 CST 2018
     */
    int updateByPrimaryKey(JoinClass record);
}