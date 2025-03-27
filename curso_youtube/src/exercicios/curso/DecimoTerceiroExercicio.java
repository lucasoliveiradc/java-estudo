package exercicios.curso;

import java.util.Scanner;

public class DecimoTerceiroExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe sua altura para verificar o peso ideal: ");
		
		double altura = scan.nextDouble();
		
		System.out.print("Informe seu sexo: ");
		
		String sexo = scan.next();
		
		double pesoIdealHomem = (72.7 * altura) - 58;
		double pesoIdealMulher = (62.1 * altura) - 44.7;
	
		System.out.println("Para homens o peso ideal é: " + pesoIdealHomem);
		System.out.println("Para mulheres o peso ideal é: " + pesoIdealMulher);
	
		System.out.println("Informe o seu peso");
		
		double pesoAtual = scan.nextDouble();
		
		if(pesoAtual == pesoIdealHomem || pesoAtual == pesoIdealMulher) {
			System.out.println("O peso está ideal");
		}
		
		else if(pesoAtual > pesoIdealHomem || pesoAtual > pesoIdealMulher) {
			System.out.println("O seu peso está acima");
		}
		
		else {
			System.out.println("O peso está abaixo");
		}
	}

}
