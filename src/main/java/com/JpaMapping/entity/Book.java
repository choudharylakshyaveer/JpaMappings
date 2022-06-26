package com.JpaMapping.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "book_id")
	private int book_id;
	private int title;
	private int total_pages;
	
	@OneToOne
	@JoinColumn
	Photo photo;
	
	@ManyToMany
	@JoinTable(name = "author", 
	joinColumns = @JoinColumn(
			name = "book_author", 
			referencedColumnName = "book_id"
			), 
	inverseJoinColumns = @JoinColumn(
			name = "author_book", 
			referencedColumnName = "author_id")
	)
	private List<Author> authors;
	
	@JoinTable(name="category",
			joinColumns = @JoinColumn(
					name="book_category",
					referencedColumnName = "book_id"
					),
			inverseJoinColumns = @JoinColumn(
					name="category_book",
					referencedColumnName = "category_id"
					))
	@ManyToMany
	private List<Category> categories;
	
}
