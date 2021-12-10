package projects;

import java.util.Scanner;

public class exercicio4Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int A, B, C, D, R, S;
		System.out.print("Digite A:");
		A = ler.nextInt();
		
		System.out.print("Digite B:");
		B = ler.nextInt();
		
		System.out.print("Digite C:");
		C = ler.nextInt();
		
		R = (A + B)*(A + B);
		S = (B + C)*(B + C);
		D = (R + S)/2;
		
		System.out.println(D);
				
				
		

	}

}
