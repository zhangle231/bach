package com.bach.monitor.mapper;

import com.bach.monitor.domain.BachOggChannelMapView;
import com.bach.monitor.domain.BachOggChannelMapViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BachOggChannelMapViewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    long countByExample(BachOggChannelMapViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int deleteByExample(BachOggChannelMapViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insert(BachOggChannelMapView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int insertSelective(BachOggChannelMapView record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    List<BachOggChannelMapView> selectByExample(BachOggChannelMapViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExampleSelective(@Param("record") BachOggChannelMapView record, @Param("example") BachOggChannelMapViewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bach_ogg_channel_map_view
     *
     * @mbg.generated Thu Aug 01 12:36:06 CST 2019
     */
    int updateByExample(@Param("record") BachOggChannelMapView record, @Param("example") BachOggChannelMapViewExample example);
}