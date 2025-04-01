package exercicios.curso;

import java.util.Scanner;

public class DecimoSextoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informe a área de pintura: ");
		
		double areaMetrosQuadrados = scan.nextDouble();
		
		double coberturaTinta = 1 * 0.33333333333333333333;
		int lata = 18;
		double valorLata = 80.00;		
		
		double quantidadesLata = (areaMetrosQuadrados * coberturaTinta) / lata;
		System.out.println("Quantidade de latas que precisam ser compradas: " + quantidadesLata);
		
		System.out.println("O valor total é: " + valorLata * quantidadesLata);

	}

}
