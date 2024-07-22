package br.com.AbstractFactory;

public class Customer {

	private String Nome;
	private String Quality;
	private String Vehicle;
	
	public Customer(String Nome, String Quality, String Vehicle) {
		this.Nome = Nome;
		this.Quality = Quality;
		this.Vehicle = Vehicle;
		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getQuality() {
		return Quality;
	}

	public void setQuality(String quality) {
		Quality = quality;
	}

	public String getVehicle() {
		return Vehicle;
	}

	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}
}
