package day27.dbconnect;

public class PersonsVO {

private int ID;
private String LastName;
private String FirstName;
private int Age;
private String City;	
	
public PersonsVO() {}

public PersonsVO(int iD, String lastName, String firstName, int age, String city) {
	ID = iD;
	LastName = lastName;
	FirstName = firstName;
	Age = age;
	City = city;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getLastName() {
	return LastName;
}

public void setLastName(String lastName) {
	LastName = lastName;
}

public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public int getAge() {
	return Age;
}

public void setAge(int age) {
	Age = age;
}

public String getCity() {
	return City;
}

public void setCity(String city) {
	City = city;
}

@Override
public String toString() {
	return "Persons [ID=" + ID + ", LastName=" + LastName + ", FirstName=" + FirstName + ", Age=" + Age + ", City="
			+ City + "]";
}





}
