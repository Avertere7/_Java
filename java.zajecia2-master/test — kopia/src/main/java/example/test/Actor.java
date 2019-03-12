package example.test;





public class Actor {

	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String name;
	private String dateOfBirth;
	private String biography;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String date) {
		this.dateOfBirth = date;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public Actor(String name, String yob1, String biography) {
		this.name = name;
		this.dateOfBirth = yob1;
		this.biography = biography;
	}
	public Actor() {
	
	}
	

}
