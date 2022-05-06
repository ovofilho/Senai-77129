package Estruturas_de_controle;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args) {
		String texto = "";
		Scanner entrada = new Scanner(System.in);
		
		do {
			
			System.out.println("você precisa falar"
				+ " as palavras magicas!!");
		System.out.println("quer sair?");
		System.out.println("fale as palavras magicas!!!");
		texto = entrada.nextLine();
		
		
	} while(!texto.equalsIgnoreCase("sair"));
		entrada.close();
	System.out.println("obrigado");	
}
}