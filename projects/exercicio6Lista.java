package projects;

import java.util.Scanner;

public class exercicio6Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double x1,x2,y1,y2, d;
		
		System.out.println("Digite x1 :");
		x1 = ler.nextDouble();
		
		
		System.out.println("Digite x2 :");
		x2 = ler.nextDouble();
		
		
		System.out.println("Digite y1 :");
		y1 = ler.nextDouble();
		
		
		System.out.println("Digite y2 :");
		y2 = ler.nextDouble();
		
		
		d = Math.pow(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)), 1/2);
		
		System.out.println("Resultado :"+d);
		
		
	

	}

}
