package exercicios.curso;

import java.util.Scanner;

public class DecimoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a temperatura em Celsius: ");
		
		double grausCelsius = scan.nextDouble();
		
		double grausFarenheit = (grausCelsius * 1.8) + 32;
		
		System.out.println("A temperatura em Farenheit é: " + grausFarenheit);
	}

}
