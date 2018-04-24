package com.cdut.myschool.persist.mapper;

import com.cdut.myschool.persist.entity.Zone;
import com.cdut.myschool.persist.entity.ZoneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    long countByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int deleteByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int insert(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int insertSelective(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    List<Zone> selectByExample(ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    Zone selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int updateByExampleSelective(@Param("record") Zone record, @Param("example") ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int updateByExample(@Param("record") Zone record, @Param("example") ZoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int updateByPrimaryKeySelective(Zone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table zone
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    int updateByPrimaryKey(Zone record);
}