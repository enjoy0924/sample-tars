package com.altas.erp.eds.entity;

public class AccountMoveLineEntityWithBLOBs extends AccountMoveLineEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move_line.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String ref;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move_line.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move_line.ref
     *
     * @return the value of account_move_line.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getRef() {
        return ref;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move_line.ref
     *
     * @param ref the value for account_move_line.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setRef(String ref) {
        this.ref = ref == null ? null : ref.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move_line.name
     *
     * @return the value of account_move_line.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move_line.name
     *
     * @param name the value for account_move_line.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}