package exercicios.curso;

import java.util.Scanner;

public class SetimoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Determinado o valor do lado do quadrado");
		
		double lado = scan.nextDouble();
		
		double areaQuadrado = lado * lado;
		
		System.out.println("O dobro da área do quadrado é: " + areaQuadrado * 2);
		
	}

}
