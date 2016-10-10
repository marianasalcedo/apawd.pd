package es.upm.miw.models.entities;

import java.util.List;

public class Author {

	private int id;
	private String surname;
	private String name;
	private Contact contact;
	private Style style;
	private List<Book> books;
	
	public Author(String surname, String name, Contact contact, Style style) {
		this.surname = surname;
		this.name = name;
		this.contact = contact;
		this.style = style;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Contact getContact() {
		return contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public Style getStyle() {
		return style;
	}
	
	public void setStyle(Style styles) {
		this.style = styles;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public int getId() {
		return id;
	}

}

