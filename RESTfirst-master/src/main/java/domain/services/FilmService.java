package domain.services;

import java.util.ArrayList;
import java.util.List;

import domain.Aktor;
import domain.Film;


public class FilmService {

	private static List<Film> filmy = new ArrayList<Film>();
	private static List<Aktor> aktorzy = new ArrayList<Aktor>();
	
	public List<Aktor> getAllA(){
		return aktorzy;
	}
	private static int currentId=1;

	public List<Film> getAllF(){
	
		return filmy;
		
	}
	public Aktor getA(int id)
	{
		for(Aktor a : aktorzy) {
			if(a.getId()==id)
				return a;
		}
		return null;
	}
	public Film getF(int id)
	{
		for(Film f : filmy) {
			if(f.getId()==id)
				return f;
		}
		return null;
	}
	
	
	public void addF(Film f) {
		f.setId(++currentId);
		filmy.add(f);
	}
	public void removeF(Film f) {
		filmy.remove(f);
	}
	
	
	public void updateF(Film film) {
		for(Film f:filmy) {
			if(f.getId()==film.getId())
			{
				f.setName(film.getName());
				f.setKom(film.getKom());
				f.setAktorzy(film.getAktorzy());
				f.setOceny(film.getOceny());
			}
		}
	}
	
}
