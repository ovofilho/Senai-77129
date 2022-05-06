package Estruturas_de_controle;

import java.util.Scanner;

public class Desafio_while {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double total =0, nota=0;
		int i =0;
		
		while(nota != -1) {
			System.out.print("digite a nota: ou -1 para sair ");
			nota= entrada.nextDouble();
			
			
			if(nota <=10 && nota>= 0) {
				total += nota;
				i++;
			}else {
				System.out.println("nota invalida!!!!");
			}
			
			
			
		}
		
		
		
		
		//calcular media;
		double media =  total/i;
		System.out.println("foram "+ i + "a media foi " + media);
		
		entrada.close();
	}
}
