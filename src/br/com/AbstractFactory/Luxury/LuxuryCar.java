package br.com.AbstractFactory.Luxury;

import br.com.AbstractFactory.Car;

public class LuxuryCar extends Car{

	public LuxuryCar(String Model, String Color, String Year) {
		super(Model, Color, Year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " escolheu o carro de luxo: {" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                '}';
	}

}
