package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachOggChannelMapSrcView;
import com.bach.monitor.domain.BachOggChannelMapSrcViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachOggChannelMapSrcViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_src_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachOggChannelMapSrcViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_src_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachOggChannelMapSrcViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_src_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachOggChannelMapSrcView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_src_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachOggChannelMapSrcView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_src_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachOggChannelMapSrcView> selectByExample(BachOggChannelMapSrcViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_src_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachOggChannelMapSrcView record, @Param("example") BachOggChannelMapSrcViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_src_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachOggChannelMapSrcView record, @Param("example") BachOggChannelMapSrcViewExample example);
}