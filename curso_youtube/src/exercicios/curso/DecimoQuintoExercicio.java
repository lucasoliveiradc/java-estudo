package exercicios.curso;

import java.util.Scanner;

public class DecimoQuintoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Quanto você ganha por hora: ");
		double ganhosHora = scan.nextDouble();
		
		System.out.print("Horas trabalhas por mês: ");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = ganhosHora * horasTrabalhadas;
		
		System.out.println("O salário bruto é: R$ " + salarioBruto);
		
		double inss = salarioBruto * 0.08;
		System.out.println("Valor INSS: R$ " + inss);
		
		double sindicato = salarioBruto * 0.05;
		System.out.println("Valor sindicato: R$ " + sindicato);
		
		double imposto = salarioBruto * 0.11;
		
		double salarioLiquido = salarioBruto - inss - sindicato - imposto;
		
		System.out.println("O salário líquido ficou: " + salarioLiquido);
		
		double desconto = inss + sindicato + imposto;
		System.out.println("Total de desconto foi: " + desconto);
	}

}
