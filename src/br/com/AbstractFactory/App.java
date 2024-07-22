package br.com.AbstractFactory;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o Nome do Cliente");
		Scanner s = new Scanner(System.in);
		String DigitaNome = s.next();
		
		System.out.println("Digite 1 para modelos economicos e 2 para modelos de luxo");
		Scanner x = new Scanner(System.in);
		String Valor = x.next();
		
		System.out.println("Digite 1 para motos e 2 para carros");
		Scanner z = new Scanner(System.in);
		String Tipo = z.next();
		
		VehicleFactory factory = null;
		
		// Verifique a opção de modelo (econômico ou luxo)
        if (Valor.equals("1")) {
            factory = new EconomyFactory();
        } else if (Valor.equals("2")) {
            factory = new LuxuryFactory();
        } else {
            System.out.println("Opção inválida para modelo!");
        }
        
        // Verifique a opção de tipo de veículo (moto ou carro)
        if (Tipo.equals("1")) {
            Motorcycle motorcycle = factory.createMotorcycle();
            System.out.println(DigitaNome + motorcycle);
        } else if (Tipo.equals("2")) {
            Car car = factory.createCar();
            System.out.println(DigitaNome + car);
        } else {
            System.out.println("Opção inválida para tipo de veículo!");
        }
        
        s.close();
        x.close();
        z.close();
	}
	

}
