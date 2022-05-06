package Estruturas_de_controle;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("oii");
		conjunto.add(1);
		conjunto.add('X');
		System.out.println(conjunto);
		System.out.println("Tamanho é "+ conjunto.size());
		
		Set nums = new HashSet();
		nums.add(2);
		nums.add(3);
		nums.add(1);
		
		System.out.println(nums);
		System.out.println(nums.size());
		
		
		conjunto.addAll(nums);
		System.out.println(conjunto);
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto.size());
		System.out.println(conjunto);
		
		
		// tipos de colections Set
		
		
		
		
		
		
		
		
		
	}
}
