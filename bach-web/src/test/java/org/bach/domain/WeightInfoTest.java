package org.bach.domain;

import javax.annotation.Resource;

import org.bach.mapper.WeightInfoMapper;
import org.bach.web.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class) 
@SpringBootTest(classes = App.class )
@EnableAutoConfiguration
public class WeightInfoTest {
	
	private static final Logger log = LoggerFactory.getLogger(WeightInfoTest.class);
	
	@Resource
	WeightInfoMapper weightInfoMapper;

	@Test
	public void testFindWeightInfoAll() {
		WeightInfo weightInfo = weightInfoMapper.selectById(1);
		log.info("weight:{}", weightInfo);
	}
	

}
