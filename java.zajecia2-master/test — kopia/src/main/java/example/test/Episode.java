package example.test;



public class Episode{
	private String name;
	private String releaseDate;
	private int seasonID;
	private int episodeNumber;
	private int duration;
	
	public int getSeasonID() {
		return seasonID;
	}
	public void setSeasonID(int seasonID) {
		this.seasonID = seasonID;
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
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public int getseasonID() {
		return seasonID;
	}
	public void setseasonID(int seasonID) {
		this.seasonID = seasonID;
	}
	public int getEpisodeNumber() {
		return episodeNumber;
	}
	public void setEpisodeNumber(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Episode(String name, String releaseDate, int episodeNumber,int duration,int seasonID
			) {
		super();
		this.name = name;
		this.releaseDate = releaseDate;
		this.episodeNumber = episodeNumber;
		this.seasonID = seasonID;
		this.duration = duration;
	}
	public Episode() {
		
	}
	

}
