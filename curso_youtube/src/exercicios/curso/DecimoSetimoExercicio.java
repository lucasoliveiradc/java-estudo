package exercicios.curso;

import java.util.Scanner;

public class DecimoSetimoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Informa a area a ser pintada: ");
		
		double areaPintura = scan.nextDouble();
		double coberturaTinta = 1 * 0.166666666666666666;
		double lata = 18;
		double galaoTinta = 3.6;
		double quantTintasLata = ((coberturaTinta * areaPintura) / lata);
		double quantTintasGalao = ((coberturaTinta * areaPintura) / galaoTinta);
		double valorTintasLata = quantTintasLata * 80;
		double valorTintasGalao = quantTintasGalao * 25;
		
		System.out.println("Quantidades de tintas por lata: " + quantTintasLata);
		System.out.println("O valor é : " + valorTintasLata);
		System.out.println("Quantidades de tintas por galao: " + quantTintasGalao);
		System.out.println("O valor é: " + valorTintasGalao);
		
		double quantLataMistura = (quantTintasLata + quantTintasGalao) / 2;
		double valorMistura = (valorTintasLata / 2) + (valorTintasGalao / 2);
		
		System.out.println("Quantidade mistura latas: " + quantLataMistura);
		System.out.print("O valor é: " + valorMistura * 0.1);
	}

}
