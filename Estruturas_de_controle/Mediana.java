package Estruturas_de_controle;

public class Mediana {
	public static void main(String[] args) {
		int[] vetor = new int[7];
		
		
		vetor[0]=1;
		vetor[1]=2;
		vetor[2]=3;
		vetor[3]=4;
		vetor[4]=5;
		vetor[5]=6;
		vetor[6]=7;
		vetor[7]=8;
		
		
		int meio = (vetor.length -1)/2;
		System.out.println(vetor[meio]);
	}
}
