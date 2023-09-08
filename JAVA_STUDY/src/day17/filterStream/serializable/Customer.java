package day17.filterStream.serializable;

import java.io.Serializable;

public class Customer implements Serializable {

	
	private static final long serialVersionUID = 7869736258279346602L;

	private String name;
	private char gender;
	private String email;
	private int birthyear;
	
	public Customer(String name, char gender, String email, int birthyear) {
		super();
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthyear = birthyear;
	}
	
	public Customer() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirthyear() {
		return birthyear;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ","
				+ " birthyear=" + birthyear + "]";
	}

	
	

 
	
	

  
}
