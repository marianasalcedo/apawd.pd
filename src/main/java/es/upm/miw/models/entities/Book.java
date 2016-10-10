package es.upm.miw.models.entities;

import java.util.List;

public class Book {
	
	private int id;
	private String isbn;
	private List<Theme> themes;
	
	public Book(int id, String isbn, List<Theme> themes) {
		this.id = id;
		this.isbn = isbn;
		this.themes = themes;
	}

	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public List<Theme> getThemes() {
		return themes;
	}
	
	public void setThemes(List<Theme> themes) {
		this.themes = themes;
	}
	
	public int getId() {
		return id;
	}
	
	

}
