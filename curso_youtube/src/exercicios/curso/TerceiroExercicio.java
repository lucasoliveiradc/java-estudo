package exercicios.curso;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Insira o segundo número: ");
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos números são: " + resultado);
		

	}

}
