package Estruturas_de_controle;

import java.util.Scanner;

public class Desafio_da_semana {
	//programa que troca os dias da semana por numéros.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String semana;
		
		System.out.println("Digite um dia da semana.");
		semana = entrada.next();
		
		entrada.close();

		if("domingo".equals(semana)) {
			System.out.println(1);
		}
		else if("segunda".equalsIgnoreCase(semana)) {
			System.out.println(2);
		}
		else if("terça".equals(semana)) {
			System.out.println(3);
		}
		else if("quarta".equals(semana)) {
			System.out.println(4);
		}
		else if("quinta".equals(semana)) {
			System.out.println(5);
		}
		else if("sexta".equals(semana)) {
			System.out.println(6);
		}
		else if("sábado".equals(semana)) {
			System.out.println(7);
		}
		
		
			}	
}
