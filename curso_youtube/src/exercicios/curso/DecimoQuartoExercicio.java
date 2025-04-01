package exercicios.curso;

import java.util.Scanner;

public class DecimoQuartoExercicio {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Coloque o peixe para verificar o peso: ");
		double pesoPeixe = scan.nextDouble();
		int pesoPeixeMaximo = 50;
		
		if(pesoPeixe > pesoPeixeMaximo) {
			
			double excesso = pesoPeixe - pesoPeixeMaximo;
			double multa = excesso * 4.00;
			
			System.out.println("O peso excedeu " + excesso + " Kg" + " e a multa deu: " + multa );
		}
		
		else {
			double excesso = 0;
			double multa = 0;
			
			System.out.println("Peso não excedeu: " + excesso + " e a multa foi: " + multa);
		}
		
	}

}
