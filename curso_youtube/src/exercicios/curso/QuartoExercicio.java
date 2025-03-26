package exercicios.curso;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeira nota bimestral: ");
		double primeiroBimestre = scan.nextDouble();
		
		System.out.println("Segunda nota bimestral: ");
		double segundoBimestre = scan.nextDouble();
		
		System.out.println("Terceira nota bimestral");
		double terceiroBimestre = scan.nextDouble();
		
		System.out.println("Quarta nota bimestral: ");
		double quartoBimestre = scan.nextDouble();
		
		
		double mediaAno = (primeiroBimestre + segundoBimestre + terceiroBimestre + quartoBimestre) / 4;
		
		
		System.out.println("A média das notas é: " + mediaAno);

	}

}
