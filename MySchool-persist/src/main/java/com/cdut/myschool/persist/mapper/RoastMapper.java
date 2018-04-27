package com.cdut.myschool.persist.mapper;

import com.cdut.myschool.persist.entity.Roast;
import com.cdut.myschool.persist.entity.RoastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoastMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    long countByExample(RoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int deleteByExample(RoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int insert(Roast record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int insertSelective(Roast record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    List<Roast> selectByExample(RoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    Roast selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByExampleSelective(@Param("record") Roast record, @Param("example") RoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByExample(@Param("record") Roast record, @Param("example") RoastExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByPrimaryKeySelective(Roast record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table roast
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    int updateByPrimaryKey(Roast record);
}