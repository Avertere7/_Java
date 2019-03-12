package example.test;

import java.util.ArrayList;
import java.util.List;




public class TvSeries {
	private String name;
	List<Season> seasons= new ArrayList<Season>();
	private int idSeason;
	
	public int getIdSeason() {
		return idSeason;
	}
	public void setIdSeason(int idSeason) {
		this.idSeason = idSeason;
	}

	private long id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public TvSeries() {

	}
	public TvSeries(String name, int idSeason ) {
		super();
		this.name = name;
		this.idSeason = idSeason;
	}
	

}
