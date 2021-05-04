package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
int id;
String firstName;
String lastName;
int dateOfYear;
Long nationalityId;

public Gamer() {
	
}



public Gamer(int id, String firstName, String lastName, int dateOfYear, Long nationalityId) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfYear = dateOfYear;
	this.nationalityId = nationalityId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getDateOfYear() {
	return dateOfYear;
}

public void setDateOfYear(int dateOfYear) {
	this.dateOfYear = dateOfYear;
}

public Long getNationalityId() {
	return nationalityId;
}

public void setNationalityId(Long nationalityId) {
	this.nationalityId = nationalityId;
}
}
