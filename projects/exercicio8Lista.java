package projects;

import java.util.Scanner;

public class exercicio8Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Double cc, cf, pd, impostos;
		
		System.out.println("Digite o custo de f�brica :");
		cf = ler.nextDouble();
		
		pd = cf * 0.28;
		impostos = cf * 0.45;
		
		cc = cf + pd + impostos;
		
		System.out.println("O custo do consumidor � :"+"R$ " +cc);
		
		

	}

}
