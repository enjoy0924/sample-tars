package com.altas.erp.eds.entity;

public class BaseLanguageExportEntityWithBLOBs extends BaseLanguageExportEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_language_export.lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String lang;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_language_export.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_language_export.format
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String format;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_language_export.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_language_export.data
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private byte[] data;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_language_export.lang
     *
     * @return the value of base_language_export.lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getLang() {
        return lang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_language_export.lang
     *
     * @param lang the value for base_language_export.lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_language_export.name
     *
     * @return the value of base_language_export.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_language_export.name
     *
     * @param name the value for base_language_export.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_language_export.format
     *
     * @return the value of base_language_export.format
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getFormat() {
        return format;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_language_export.format
     *
     * @param format the value for base_language_export.format
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_language_export.state
     *
     * @return the value of base_language_export.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_language_export.state
     *
     * @param state the value for base_language_export.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_language_export.data
     *
     * @return the value of base_language_export.data
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public byte[] getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_language_export.data
     *
     * @param data the value for base_language_export.data
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setData(byte[] data) {
        this.data = data;
    }
}