package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachOggPmpChannelParameterView;
import com.bach.monitor.domain.BachOggPmpChannelParameterViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachOggPmpChannelParameterViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_pmp_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachOggPmpChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_pmp_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachOggPmpChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_pmp_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachOggPmpChannelParameterView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_pmp_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachOggPmpChannelParameterView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_pmp_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachOggPmpChannelParameterView> selectByExample(BachOggPmpChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_pmp_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachOggPmpChannelParameterView record, @Param("example") BachOggPmpChannelParameterViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_pmp_channel_parameter_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachOggPmpChannelParameterView record, @Param("example") BachOggPmpChannelParameterViewExample example);
}