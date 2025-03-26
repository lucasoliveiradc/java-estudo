package exercicios.curso;

import java.util.Scanner;

public class SextoExercicio {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo: ");
		
		double raio = scan.nextDouble();
		
		double area = (raio * raio) * 3.14;
		
		
		System.out.println("O valor da area é: " + area);

	}

}
