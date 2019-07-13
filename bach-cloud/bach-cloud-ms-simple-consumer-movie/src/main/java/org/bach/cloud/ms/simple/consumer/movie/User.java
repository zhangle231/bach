package org.bach.cloud.ms.simple.consumer.movie;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class User {
	private Long id;
	private String username;
	private String name;
	private Integer age;
	private BigDecimal balance;
}
