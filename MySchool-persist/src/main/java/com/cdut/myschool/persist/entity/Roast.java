package com.cdut.myschool.persist.entity;

import java.util.Date;

public class Roast {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast.topic_id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String topicId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast.context
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String context;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast.type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast.time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private Date time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column roast.cognate_id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String cognateId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast.id
     *
     * @return the value of roast.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast.id
     *
     * @param id the value for roast.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast.topic_id
     *
     * @return the value of roast.topic_id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast.topic_id
     *
     * @param topicId the value for roast.topic_id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast.context
     *
     * @return the value of roast.context
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast.context
     *
     * @param context the value for roast.context
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast.type
     *
     * @return the value of roast.type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast.type
     *
     * @param type the value for roast.type
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast.time
     *
     * @return the value of roast.time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public Date getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast.time
     *
     * @param time the value for roast.time
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column roast.cognate_id
     *
     * @return the value of roast.cognate_id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getCognateId() {
        return cognateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column roast.cognate_id
     *
     * @param cognateId the value for roast.cognate_id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setCognateId(String cognateId) {
        this.cognateId = cognateId == null ? null : cognateId.trim();
    }
}