package day3Hw2;

public class User {
	private int id;
	private String email;

//	private String firstName;
//	private String LastName;
	public User() {
	}

	public User(int id, String email) {
		this.id = id;
		this.email = email;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
