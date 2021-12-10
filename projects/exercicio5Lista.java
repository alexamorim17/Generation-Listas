package projects;

import java.util.Scanner;

public class exercicio5Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nota1,nota2,nota3,media;
		
		
		System.out.print("Digite nota 1:");
		nota1 = ler.nextDouble();

		System.out.print("Digite nota 2:");
		nota2 = ler.nextDouble();
		
		System.out.print("Digite nota 3:");
		nota3 = ler.nextDouble();
		
		nota1 = nota1*2;
		nota2 = nota2*3;
		nota3 = nota3*5;
		
		media =(nota1 + nota2 + nota3)/10;
		
		System.out.print("A media foi: "+ media);
		

	}

}
