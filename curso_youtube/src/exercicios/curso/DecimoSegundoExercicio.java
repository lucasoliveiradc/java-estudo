package exercicios.curso;

import java.util.Scanner;

public class DecimoSegundoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informe sua altura para verificar o peso ideal: ");
		
		
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		
		System.out.println("Seu peso ideal é: " + pesoIdeal);
		

	}

}
