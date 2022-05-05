package unifacs_nota;

import java.util.Scanner;

public class atividadeJoguinho {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("quantidade de questões?");
		int qtdG = scan.nextInt();
		
		int [] gabarito = new int[qtdG];
		
		//armazernar valores Randomicos no array acima
		
		for(int i = 0; i<gabarito.length; i++) {
			gabarito[i]= (int)(Math.random()*20)+1;
		}
		
		//teste de demonstracao
		System.out.println("Validando meu vetor Randomico");
		for(int i = 0; i < gabarito.length; i++) {
			System.out.print(gabarito[i]+" |");
		}
		
		//quantidade de players
		System.out.println("  ");
		System.out.println("Qual o numeros de players ?");
		int numberplay = scan.nextInt();
		
		
		//criando o vetor de jogadores
		
		String[] nomes = new String[numberplay];
		
		for(int i =0; i<numberplay;i++) {
			System.out.println(" player ");
			nomes[i] = scan.next();
			
		}
		
		//validando players
		
		System.out.println("Validacão de players");
		for(int i =0; i<numberplay;i++) {
			System.out.println(nomes[i]);
		}
		
		//criando o game agora
		
		int[][] jogo = new int[numberplay][qtdG];
		System.out.println("coisas contidas no array");
		for (int i = 0; i < jogo.length; i++) {
			System.out.println("Player " + (i+1) + nomes[i]);
			for (int j = 0; j < jogo[i].length; j++) {
				System.out.println(jogo[i][j] );
			}
		}
		System.out.println(" ");
		int[] pontos = new int[numberplay];
		
		System.out.println("digite os numeros");
		for (int i = 0; i <  jogo.length; i++) {
				System.out.println("Player " + (i+1) + nomes[i]);
			for (int j = 0; j < jogo[i].length; j++) {
					jogo[i][j] = scan.nextInt();
						if(gabarito[j] == jogo[i][j]) {
							pontos[i]+=1;
								System.out.println("acertou");
						}
						else {
							System.out.println("Gamer Over!!!");
							break;
						}
				
			}
		}
		
		//validando o preenchimento do array
		System.out.println("coisas contidas no array");
		for (int i = 0; i < jogo.length; i++) {
			System.out.println("Player " + (i+1) + nomes[i]);
			for (int j = 0; j < jogo[i].length; j++) {
				System.out.println(jogo[i][j] );
			}
		}
		
		// notas
		
		for(int i=0; i<pontos.length; i++){
	           System.out.println("O jogador " + nomes[i] + " acertou " + pontos[i]);
	       }
			
		scan.close();
	}
	
}
