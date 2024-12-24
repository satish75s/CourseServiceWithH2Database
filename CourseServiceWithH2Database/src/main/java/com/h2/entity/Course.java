package com.h2.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
	@Id
	@GeneratedValue
	private int courseId;
	private String name;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date startDate;
	private double fees;
	private boolean isCertificateAvailable;
}
