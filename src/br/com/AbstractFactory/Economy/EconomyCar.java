package br.com.AbstractFactory.Economy;

import br.com.AbstractFactory.Car;

public class EconomyCar extends Car{

	public EconomyCar(String Model, String Color, String Year) {
		super(Model, Color, Year);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " escolheu o carro econômico: {" +
                "model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                '}';
	}

}
