package example.test;

import java.util.ArrayList;
import java.util.List;

public class Season {
	private int seasonNumber;
	
	private String yearOfRelease;
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	List<Episode> episodes= new ArrayList<Episode>();
	public int getSeasonNumber() {
		return seasonNumber;
	}
	public void setSeasonNumber(int idEpisode) {
		this.seasonNumber = idEpisode;
	}
	public String getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(String yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public Season(int seasonNumber, String yearOfRelease) {
		super();
		this.seasonNumber = seasonNumber;
		this.yearOfRelease = yearOfRelease;
	}
	public Season() {
	}
	
}
