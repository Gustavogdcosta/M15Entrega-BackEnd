package br.com.AbstractFactory;

public abstract class Motorcycle {

	private String Model;
	private String Color;
	private String Year;
	
	public Motorcycle (String Model, String Color, String Year) {
		this.Model = Model;
		this.setColor(Color);
		this.Year = Year;
	}

	@Override
	public abstract String toString();

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
	
	

	
}
