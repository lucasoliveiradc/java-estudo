package exercicios.curso;

import java.util.Scanner;

public class OitavoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto ganha por hora: ");
		
		int ganhoHora = scan.nextInt();
		
		System.out.print("Horas trabalhadas por mês: ");
		
		int horasTrabalhadas = scan.nextInt();
		
		int salarioMes = ganhoHora * horasTrabalhadas;
		
		System.out.println("O seu salário é: " + salarioMes);
		
		

	}

}
