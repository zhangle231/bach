package org.bach.web.jdbc;

import java.util.List;

import org.bach.domain.WeightInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) 
@SpringBootTest
public class BachWeightRepositoryTest {

	private Logger log = LoggerFactory.getLogger(BachWeightRepositoryTest.class);
	@Autowired 
	private BachWeightRepository bachWeightRepository;
	
	@Test
	public void testFindWeightInfoAll() {
		List<WeightInfo> weightInfoAll = bachWeightRepository.findWeightInfoAll();
		for (WeightInfo info : weightInfoAll) {
			log.info("info:{}", info);
		}
	}
}
