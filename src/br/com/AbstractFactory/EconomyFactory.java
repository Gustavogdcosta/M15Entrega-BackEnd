package br.com.AbstractFactory;

import br.com.AbstractFactory.Economy.EconomyCar;
import br.com.AbstractFactory.Economy.EconomyMotorcycle;

public class EconomyFactory extends VehicleFactory{

	public Car createCar() {
		return new EconomyCar("Gol", "Branco", "2005");
	}
	
	public Motorcycle createMotorcycle() {
		return new EconomyMotorcycle("Biz", "Amarela", "2010");
	}
}
