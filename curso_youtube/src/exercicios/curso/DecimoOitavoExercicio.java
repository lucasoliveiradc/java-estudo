package exercicios.curso;

import java.util.Scanner;

public class DecimoOitavoExercicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do arquivo: ");
		
		double arquivoDownload = scan.nextInt();
		double conversaoArquivo = arquivoDownload * 8;
		
		System.out.print("Digite a velocidade da Internet: ");
		double linkInternet = scan.nextInt();
		double tempoDownload = conversaoArquivo / linkInternet;
		
		System.out.print("Esse download tem o prazo estimado de: " + tempoDownload / 60);

	}

}
