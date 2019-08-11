package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachUserRole;
import com.bach.monitor.domain.BachUserRoleExample;
import com.bach.monitor.domain.BachUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByPrimaryKey(BachUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachUserRole> selectByExample(BachUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    BachUserRole selectByPrimaryKey(BachUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachUserRole record, @Param("example") BachUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachUserRole record, @Param("example") BachUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKeySelective(BachUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_user_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKey(BachUserRole record);
}