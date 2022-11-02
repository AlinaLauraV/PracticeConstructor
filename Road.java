package com.laura.demo;

public class Road {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicle("white", "volvo", 4, 01);
		vehicle.displayVehicle();

		
		Car car = new Car();
		car.setCarOwner("white", "volvo", 4, 01, "aaa");
		car.displayCarWithOwner();
	}

}
