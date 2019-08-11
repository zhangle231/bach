package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachRole;
import com.bach.monitor.domain.BachRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachRole> selectByExample(BachRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    BachRole selectByPrimaryKey(Integer roleId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachRole record, @Param("example") BachRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachRole record, @Param("example") BachRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKeySelective(BachRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_role
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKey(BachRole record);
}