package com.altas.erp.eds.entity;

public class WkfEntityWithBLOBs extends WkfEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf.osv
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String osv;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf.name
     *
     * @return the value of wkf.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf.name
     *
     * @param name the value for wkf.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf.osv
     *
     * @return the value of wkf.osv
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getOsv() {
        return osv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf.osv
     *
     * @param osv the value for wkf.osv
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setOsv(String osv) {
        this.osv = osv == null ? null : osv.trim();
    }
}