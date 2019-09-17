package fr.mds.exo2Project.author;


public class Author {
	
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		// TODO Auto-generated method stub
		this.name = name;
		this.email = email;
		if (gender == 'f' || gender == 'm') {
			this.gender = gender;
			
		}
	}
	
	public String toString() {
		return "" + gender+"";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	
	
	
}
