package DesafioSFOR;

import java.util.Scanner;

public class DesafioDaTabuada {
	public static void main(String[] args) {
		
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		numero = ler.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(
					i + " x " +numero + "=" + (i*numero));
			
			ler.close();

		}
	}
}


		
		
		
		
		
	
				



