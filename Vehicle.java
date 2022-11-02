package com.laura.demo;

public class Vehicle {
private String color, model;
private int noWheels;
private int id;


public Vehicle() {
//	this.color = color;
//	this.model = model;
//	this.noWheels = noWheels;
//	this.id = id;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getNoWheels() {
	return noWheels;
}
public void setNoWheels(int noWheels) {
	this.noWheels = noWheels;
}
public void setVehicle(String color, String model, int noWheels, int id) {
	this.id = id;
	this.color = color;
	this.model = model;
	this.noWheels = noWheels;
}
public void displayVehicle() {
	System.out.println("Id:" + id);
	System.out.println("Color:" + color);
	System.out.println("Model:" + model);
	System.out.println("number of wheels:" + noWheels);
}

}
