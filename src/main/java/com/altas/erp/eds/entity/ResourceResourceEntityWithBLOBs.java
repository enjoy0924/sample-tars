package com.altas.erp.eds.entity;

public class ResourceResourceEntityWithBLOBs extends ResourceResourceEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_resource.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_resource.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_resource.resource_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String resourceType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_resource.code
     *
     * @return the value of resource_resource.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_resource.code
     *
     * @param code the value for resource_resource.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_resource.name
     *
     * @return the value of resource_resource.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_resource.name
     *
     * @param name the value for resource_resource.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_resource.resource_type
     *
     * @return the value of resource_resource.resource_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_resource.resource_type
     *
     * @param resourceType the value for resource_resource.resource_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType == null ? null : resourceType.trim();
    }
}