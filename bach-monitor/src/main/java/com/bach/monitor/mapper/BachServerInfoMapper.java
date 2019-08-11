package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachServerInfo;
import com.bach.monitor.domain.BachServerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachServerInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachServerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachServerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByPrimaryKey(String serverId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachServerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachServerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachServerInfo> selectByExample(BachServerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    BachServerInfo selectByPrimaryKey(String serverId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachServerInfo record, @Param("example") BachServerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachServerInfo record, @Param("example") BachServerInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKeySelective(BachServerInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_server_info
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByPrimaryKey(BachServerInfo record);
}