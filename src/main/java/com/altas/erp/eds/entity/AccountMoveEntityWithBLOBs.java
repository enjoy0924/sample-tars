package com.altas.erp.eds.entity;

public class AccountMoveEntityWithBLOBs extends AccountMoveEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String ref;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.narration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String narration;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.name
     *
     * @return the value of account_move.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.name
     *
     * @param name the value for account_move.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.state
     *
     * @return the value of account_move.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.state
     *
     * @param state the value for account_move.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.ref
     *
     * @return the value of account_move.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getRef() {
        return ref;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.ref
     *
     * @param ref the value for account_move.ref
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setRef(String ref) {
        this.ref = ref == null ? null : ref.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.narration
     *
     * @return the value of account_move.narration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getNarration() {
        return narration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.narration
     *
     * @param narration the value for account_move.narration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setNarration(String narration) {
        this.narration = narration == null ? null : narration.trim();
    }
}