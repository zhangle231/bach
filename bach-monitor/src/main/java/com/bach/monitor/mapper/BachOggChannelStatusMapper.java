package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachOggChannelStatus;
import com.bach.monitor.domain.BachOggChannelStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachOggChannelStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachOggChannelStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachOggChannelStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachOggChannelStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachOggChannelStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachOggChannelStatus> selectByExample(BachOggChannelStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachOggChannelStatus record, @Param("example") BachOggChannelStatusExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_status
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachOggChannelStatus record, @Param("example") BachOggChannelStatusExample example);
}