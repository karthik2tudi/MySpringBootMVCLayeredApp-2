package com.rt.entity;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "emp_details")
@Data
@NoArgsConstructor
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	
	@Column(name = "name",nullable = false)
	private String ename;
	
	@Column(name = "address",nullable = true,length = 20)
	private String eadd;
	
	@Column(name = "g_salery")
	@Nonnull
	private int grossSalery;
	
	@Column(name = "n_salery")
	@Nonnull
	private int netSalery;
	
	@Column(name = "pf")
	private int pfContribution;

	
}
