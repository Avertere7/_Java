package example.test;




public class Director {
	
	
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
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public Director(String name, String dateOfBirth, String biography) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.biography = biography;
	}
	public Director() {
		
	}

}
