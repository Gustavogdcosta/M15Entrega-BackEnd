package br.com.AbstractFactory;

import br.com.AbstractFactory.Luxury.LuxuryCar;
import br.com.AbstractFactory.Luxury.LuxuryMotorcycle;

public class LuxuryFactory extends VehicleFactory {

	public Car createCar() {
		return new LuxuryCar("Hilux", "Prata", "2024");
	}
	
	public Motorcycle createMotorcycle() {
		return new LuxuryMotorcycle("Suzuki", "Preta", "2024");
	}
}
