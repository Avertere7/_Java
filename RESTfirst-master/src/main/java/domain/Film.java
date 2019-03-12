package domain;

import java.util.List;

public class Film {
	private int id;
	private String name;
	private List<Integer> oceny;
	private List<Aktor> aktorzy;
	private List<Komentarze> kom;
	
	public double getSrednia() {
		Integer sum = 0;
		  if(!oceny.isEmpty()) {
		    for (Integer ocena : oceny) {
		        sum += ocena;
		    }
		    return sum.doubleValue() / oceny.size();
		  }
		  return sum;
		
	}
	public void setOceny(List<Integer> ocena) {
		
		this.oceny = ocena;
	}
	public List<Integer> getOceny() {
		return oceny;
	}
	public List<Komentarze> getKom() {
		return kom;
	}
	public void setKom(List<Komentarze> kom) {
		this.kom = kom;
	}

	
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
	
	public List<Aktor> getAktorzy() {
		return aktorzy;
	}
	public void setAktorzy(List<Aktor> aktorzy) {
		this.aktorzy = aktorzy;
	}
	


}
