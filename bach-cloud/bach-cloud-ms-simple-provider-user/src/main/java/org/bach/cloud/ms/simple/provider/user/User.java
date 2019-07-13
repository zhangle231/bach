package org.bach.cloud.ms.simple.provider.user;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column
	private String username;
	
	@Column
	private String name;
	
	@Column
	private Integer age;
	
	@Column
	private BigDecimal balance;
}
