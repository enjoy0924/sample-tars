package com.altas.erp.eds.entity;

public class WebTourTourEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_tour_tour.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_tour_tour.user_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column web_tour_tour.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_tour_tour.id
     *
     * @return the value of web_tour_tour.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_tour_tour.id
     *
     * @param id the value for web_tour_tour.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_tour_tour.user_id
     *
     * @return the value of web_tour_tour.user_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_tour_tour.user_id
     *
     * @param userId the value for web_tour_tour.user_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column web_tour_tour.name
     *
     * @return the value of web_tour_tour.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column web_tour_tour.name
     *
     * @param name the value for web_tour_tour.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}