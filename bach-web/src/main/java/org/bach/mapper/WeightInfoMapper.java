package org.bach.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.bach.domain.WeightInfo;

@Mapper
public interface WeightInfoMapper {
	WeightInfo selectById(int id);
}
