package com.bach.monitor.domain;

public class BachUserRoleKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_user_role.user_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_user_role.role_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Integer roleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_user_role.user_id
     *
     * @return the value of bach_user_role.user_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_user_role.user_id
     *
     * @param userId the value for bach_user_role.user_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_user_role.role_id
     *
     * @return the value of bach_user_role.role_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_user_role.role_id
     *
     * @param roleId the value for bach_user_role.role_id
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}