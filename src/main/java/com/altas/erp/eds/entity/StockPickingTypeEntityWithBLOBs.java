package com.altas.erp.eds.entity;

public class StockPickingTypeEntityWithBLOBs extends StockPickingTypeEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking_type.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking_type.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking_type.code
     *
     * @return the value of stock_picking_type.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking_type.code
     *
     * @param code the value for stock_picking_type.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking_type.name
     *
     * @return the value of stock_picking_type.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking_type.name
     *
     * @param name the value for stock_picking_type.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}