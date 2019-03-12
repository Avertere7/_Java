package domain;

import java.util.List;

public class Aktor {
	private int id;
	private String name;
	private String surname;
	private List<Film> filmy;


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<Film> getFilmy() {
		return filmy;
	}
	public void setFilmy(List<Film> filmy) {
		this.filmy = filmy;
	}
	public void setFilmy(Film film) {
			this.filmy.add(film);
		
	}
	
}
