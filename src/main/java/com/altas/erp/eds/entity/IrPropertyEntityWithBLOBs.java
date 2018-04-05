package com.altas.erp.eds.entity;

public class IrPropertyEntityWithBLOBs extends IrPropertyEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_property.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_property.value_text
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String valueText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_property.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String resId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_property.value_binary
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private byte[] valueBinary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_property.value_reference
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String valueReference;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_property.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_property.name
     *
     * @return the value of ir_property.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_property.name
     *
     * @param name the value for ir_property.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_property.value_text
     *
     * @return the value of ir_property.value_text
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getValueText() {
        return valueText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_property.value_text
     *
     * @param valueText the value for ir_property.value_text
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setValueText(String valueText) {
        this.valueText = valueText == null ? null : valueText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_property.res_id
     *
     * @return the value of ir_property.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getResId() {
        return resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_property.res_id
     *
     * @param resId the value for ir_property.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_property.value_binary
     *
     * @return the value of ir_property.value_binary
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public byte[] getValueBinary() {
        return valueBinary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_property.value_binary
     *
     * @param valueBinary the value for ir_property.value_binary
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setValueBinary(byte[] valueBinary) {
        this.valueBinary = valueBinary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_property.value_reference
     *
     * @return the value of ir_property.value_reference
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getValueReference() {
        return valueReference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_property.value_reference
     *
     * @param valueReference the value for ir_property.value_reference
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setValueReference(String valueReference) {
        this.valueReference = valueReference == null ? null : valueReference.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_property.type
     *
     * @return the value of ir_property.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_property.type
     *
     * @param type the value for ir_property.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}