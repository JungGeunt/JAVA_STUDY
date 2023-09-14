package day18.quiz;

import java.io.Serializable;
//db
public class Customer implements Serializable{

private static final long serialVersionUID = -1797299035202407306L;
//멤버 필드
String name;
String gender;
String email;
String birthYear;

//생성자
public Customer() {}

public Customer(String name, String gender, String email, String birthYear) {
	super();
	this.name = name;
	this.gender = gender;
	this.email = email;
	this.birthYear = birthYear;
}



@Override
public String toString() {
	return "Customer [이름=" + name + ", 성별=" + gender + ", email=" + email + ", 생년월일=" + birthYear + "]";
}

//게터 세터
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getBirthYear() {
	return birthYear;
}

public void setBirthYear(String birthYear) {
	this.birthYear = birthYear;
}



	
}
