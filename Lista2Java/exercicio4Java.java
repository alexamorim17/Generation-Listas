package Lista2Java;

import java.util.Scanner;

public class exercicio4Java {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		Double n;
		int a;
		
		System.out.println("Digite um n�mero :");
		n = ler.nextDouble();
		
		if(n%2 == 0) {
			
			System.out.println("N�mero par");
			Math.sqrt(n);
			System.out.println("A raiz quadrada de "+n+" � "+Math.sqrt(n));
			
			
		}else {
			
			System.out.println("N�mero impar");
			for(a = 1; a<=1;a++) {
				
				n = n *n;
				
			}
			System.out.println(n);
		}
	}

}
