package com.altas.erp.eds.entity;

public class IrActionsEntityWithBLOBs extends IrActionsEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_actions.help
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String help;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_actions.usage
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String usage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_actions.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_actions.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_actions.help
     *
     * @return the value of ir_actions.help
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getHelp() {
        return help;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_actions.help
     *
     * @param help the value for ir_actions.help
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setHelp(String help) {
        this.help = help == null ? null : help.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_actions.usage
     *
     * @return the value of ir_actions.usage
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getUsage() {
        return usage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_actions.usage
     *
     * @param usage the value for ir_actions.usage
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setUsage(String usage) {
        this.usage = usage == null ? null : usage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_actions.type
     *
     * @return the value of ir_actions.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_actions.type
     *
     * @param type the value for ir_actions.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_actions.name
     *
     * @return the value of ir_actions.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_actions.name
     *
     * @param name the value for ir_actions.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}