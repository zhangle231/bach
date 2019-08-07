package com.bach.monitor.domain;

import java.util.Date;

public class BachRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_role.role_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_role.role_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_role.create_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_role.valid
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Boolean valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_role.role_id
     *
     * @return the value of bach_role.role_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_role.role_id
     *
     * @param roleId the value for bach_role.role_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_role.role_name
     *
     * @return the value of bach_role.role_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_role.role_name
     *
     * @param roleName the value for bach_role.role_name
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_role.create_time
     *
     * @return the value of bach_role.create_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_role.create_time
     *
     * @param createTime the value for bach_role.create_time
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_role.valid
     *
     * @return the value of bach_role.valid
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_role.valid
     *
     * @param valid the value for bach_role.valid
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}