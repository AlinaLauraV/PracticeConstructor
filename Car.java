package com.laura.demo;

public class Car extends Vehicle{
public Car() {
		
	}

private String owner;

public String getOwner() {
	return owner;
}

public void setOwner(String owner) {
	this.owner = owner;
}

public void setCarOwner(String color, String model, int noWheels, int id, String owner) {
	setVehicle(color, model, noWheels, id);
	this.owner = owner;
}
public void displayCarWithOwner() {
	displayVehicle();
	System.out.println("Owner:" + " "+ owner);
}
}
