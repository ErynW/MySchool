package com.cdut.myschool.persist.entity;

import java.util.Date;

public class Study {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study.name
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study.type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study.create_time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column study.end_time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private Date endTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study.id
     *
     * @return the value of study.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study.id
     *
     * @param id the value for study.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study.name
     *
     * @return the value of study.name
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study.name
     *
     * @param name the value for study.name
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study.type
     *
     * @return the value of study.type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study.type
     *
     * @param type the value for study.type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study.create_time
     *
     * @return the value of study.create_time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study.create_time
     *
     * @param createTime the value for study.create_time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column study.end_time
     *
     * @return the value of study.end_time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column study.end_time
     *
     * @param endTime the value for study.end_time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}