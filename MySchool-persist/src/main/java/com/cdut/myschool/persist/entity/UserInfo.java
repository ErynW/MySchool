package com.cdut.myschool.persist.entity;

public class UserInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.head_pic_url
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private String headPicUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.coin
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    private Integer coin;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.head_pic_url
     *
     * @return the value of user_info.head_pic_url
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public String getHeadPicUrl() {
        return headPicUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.head_pic_url
     *
     * @param headPicUrl the value for user_info.head_pic_url
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl == null ? null : headPicUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.coin
     *
     * @return the value of user_info.coin
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public Integer getCoin() {
        return coin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.coin
     *
     * @param coin the value for user_info.coin
     *
     * @mbg.generated Wed Apr 25 10:38:14 CST 2018
     */
    public void setCoin(Integer coin) {
        this.coin = coin;
    }
}