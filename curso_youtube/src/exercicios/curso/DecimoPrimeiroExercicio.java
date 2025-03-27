package exercicios.curso;

import java.util.Scanner;

public class DecimoPrimeiroExercicio {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Insira um número inteiro: ");
		
		int numberInteiro = scan.nextInt();
		
		System.out.print("Insira um segundo número inteiro: ");

		int numberInt = scan.nextInt();
		
		System.out.print("Insira um número real: ");
		
		double numeroReal = scan.nextDouble();
		
		System.out.println("O resultado do primeiro cálculo é: " + (numberInteiro * 2) * (numberInt / 2));
		
		double resultSegundoCalculo = (numberInteiro) * 3 + numeroReal; 
		
		System.out.println("O resultado do segundo cálculo é: " + resultSegundoCalculo);
		
		System.out.println("O resultado do terceiro cálculo é: " + numeroReal * numeroReal * numeroReal);
	}

}
