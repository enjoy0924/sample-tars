package com.altas.erp.eds.entity;

public class CashBoxInEntityWithBLOBs extends CashBoxInEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cash_box_in.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cash_box_in.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String ref;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cash_box_in.name
     *
     * @return the value of cash_box_in.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cash_box_in.name
     *
     * @param name the value for cash_box_in.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cash_box_in.ref
     *
     * @return the value of cash_box_in.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getRef() {
        return ref;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cash_box_in.ref
     *
     * @param ref the value for cash_box_in.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setRef(String ref) {
        this.ref = ref == null ? null : ref.trim();
    }
}