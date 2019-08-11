package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachOggChannelParameterView;
import com.bach.monitor.domain.BachOggChannelParameterViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachOggChannelParameterViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachOggChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachOggChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachOggChannelParameterView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachOggChannelParameterView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachOggChannelParameterView> selectByExample(BachOggChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachOggChannelParameterView record, @Param("example") BachOggChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachOggChannelParameterView record, @Param("example") BachOggChannelParameterViewExample example);
}