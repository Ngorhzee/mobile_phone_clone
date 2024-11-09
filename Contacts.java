package com.arrays;

import java.util.Objects;

public class Contacts {
 private String name;
 

private String number;

public void setNumber(String number) {
	this.number = number;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}
 
public Contacts(String name) {
	super();
	this.name = name;
}

public Contacts(String name, String number) {
	super();
	this.name = name;
	this.number = number;
}


public String getNumber() {
	return number;
}

//@Override
//private Operator ==
 
}
