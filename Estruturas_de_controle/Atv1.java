package Estruturas_de_controle;

import java.util.Scanner;

public class Atv1 {
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		while(true) {
			System.out.println("digite algo: ");
			String algo = entrada.nextLine();
			if("sair".equalsIgnoreCase(algo)) {
				break;
			}
		}
		System.out.println("programa parou: ");
		
		
		
		entrada.close();
		
		
		int a = 3, b =2;
		int ano_cont=2003;
		int ano_nasc=2001;
	
		System.out.println(ano_cont - 2022 >= 2 && ano_cont - 2022 <= 25  && ano_nasc - 2022 <= 55);
		
	}
}
