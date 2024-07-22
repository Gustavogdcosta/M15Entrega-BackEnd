package br.com.AbstractFactory.Luxury;

import br.com.AbstractFactory.Motorcycle;

public class LuxuryMotorcycle extends Motorcycle {

	public LuxuryMotorcycle(String Model, String Color, String Year) {
		super(Model, Color, Year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " escolheu a moto de luxo: {" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                '}';
	}

}
