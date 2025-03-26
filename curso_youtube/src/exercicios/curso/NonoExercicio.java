package exercicios.curso;

import java.util.Scanner;

public class NonoExercicio {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a temperatura: ");
		
		double grausFarenheit = scan.nextDouble();
		
		double grausCelsius = (5 * (grausFarenheit - 32) / 9);
		
		
		System.out.println("A temperatura em Celcius é: " + grausCelsius);

	}

}
