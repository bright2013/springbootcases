package com.excel.demo.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private int age;
	private SEX sex;
	
	
	public enum SEX {
		M,F
	}

}
