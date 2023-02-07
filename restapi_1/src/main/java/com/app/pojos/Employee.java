package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="new_emps")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Employee extends BaseEntity{
	@Column(length = 20)
	private String lastName;
	@Column(length = 20)
	private String firstName;
	@Column(length = 30,unique = true)
	private String email;
	private String password;
	private String department;
	private String location;
	private LocalDate joinDate;
	private double salary;

}
