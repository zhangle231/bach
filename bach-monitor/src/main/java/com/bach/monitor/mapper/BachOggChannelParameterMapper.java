package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachOggChannelParameter;
import com.bach.monitor.domain.BachOggChannelParameterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachOggChannelParameterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachOggChannelParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachOggChannelParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachOggChannelParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachOggChannelParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachOggChannelParameter> selectByExample(BachOggChannelParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachOggChannelParameter record, @Param("example") BachOggChannelParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachOggChannelParameter record, @Param("example") BachOggChannelParameterExample example);
}