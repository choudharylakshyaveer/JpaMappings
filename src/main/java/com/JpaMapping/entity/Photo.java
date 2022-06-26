package com.JpaMapping.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Photo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int photo_id;
	private String url_small;
	private String url_medium;
	private String url_large;
	
	//@OneToOne
	//private Book book;
}
