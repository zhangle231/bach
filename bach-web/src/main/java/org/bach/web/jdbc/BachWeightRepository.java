package org.bach.web.jdbc;

import java.util.List;

import org.bach.domain.WeightInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BachWeightRepository {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public BachWeightRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<WeightInfo> findWeightInfoAll() {
		List<WeightInfo> result = jdbcTemplate.query("select * from bach_weight", 
				new BeanPropertyRowMapper<WeightInfo>(WeightInfo.class));

		return result;
	}
	
	public void test() {
		jdbcTemplate.execute("");
	}
}
