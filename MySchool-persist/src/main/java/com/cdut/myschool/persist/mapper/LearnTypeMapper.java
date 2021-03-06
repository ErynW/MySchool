package com.cdut.myschool.persist.mapper;

import com.cdut.myschool.persist.entity.LearnType;
import com.cdut.myschool.persist.entity.LearnTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LearnTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    long countByExample(LearnTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int deleteByExample(LearnTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int insert(LearnType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int insertSelective(LearnType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    List<LearnType> selectByExample(LearnTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    LearnType selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") LearnType record, @Param("example") LearnTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByExample(@Param("record") LearnType record, @Param("example") LearnTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(LearnType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table learn_type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByPrimaryKey(LearnType record);
}