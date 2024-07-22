package br.com.AbstractFactory.Economy;

import br.com.AbstractFactory.Motorcycle;

public class EconomyMotorcycle extends Motorcycle{

	public EconomyMotorcycle(String Model, String Color, String Year) {
		super(Model, Color, Year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " escolheu a moto econômica: {" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                '}';
	}

}
