package com.cdut.myschool.persist.entity;

public class LearnInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_info.id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_info.user_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_info.type_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private String typeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_info.name
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column learn_info.url
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_info.id
     *
     * @return the value of learn_info.id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_info.id
     *
     * @param id the value for learn_info.id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_info.user_id
     *
     * @return the value of learn_info.user_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_info.user_id
     *
     * @param userId the value for learn_info.user_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_info.type_id
     *
     * @return the value of learn_info.type_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_info.type_id
     *
     * @param typeId the value for learn_info.type_id
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_info.name
     *
     * @return the value of learn_info.name
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_info.name
     *
     * @param name the value for learn_info.name
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column learn_info.url
     *
     * @return the value of learn_info.url
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column learn_info.url
     *
     * @param url the value for learn_info.url
     *
     * @mbg.generated Tue Apr 24 15:45:37 CST 2018
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}