package com.bach.monitor.domain;

public class BachUserRole extends BachUserRoleKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bach_user_role.valid
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    private Boolean valid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bach_user_role.valid
     *
     * @return the value of bach_user_role.valid
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bach_user_role.valid
     *
     * @param valid the value for bach_user_role.valid
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}