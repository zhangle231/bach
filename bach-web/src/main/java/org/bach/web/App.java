package org.bach.web;

import java.util.ArrayList;
import java.util.List;

import org.bach.domain.WeightInfo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("org.bach.mapper")
public class App {
	@Bean
	List<WeightInfo> weightRepository() {
		return new ArrayList<>();
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
