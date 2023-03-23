package com.qa.garage;

import com.qa.garage.vehicle.Vehicle;

// genercis are used to create a single class/interface/method that can be used
// with different types of data/objects

public class VehicleContainer<T extends Vehicle> {
// generic doesn't work with primitive types- int, float, char, etc

	private T vehicle;

	public VehicleContainer(T vehicle) {
		this.vehicle = vehicle;
	}

	public T getData() {
		return this.vehicle;

		// so e replaces the parameter type we would usually have, such as int, String,
		// etc
		// it allows for any value type
	}

}
