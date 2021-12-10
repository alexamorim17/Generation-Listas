package projects;

import java.util.Scanner;

public class exercicio1Lista {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int ano, mes, dia;
		
		System.out.print("Digite o número de dias: ");
		dia = ler.nextInt();
		
		ano = dia/365;
		mes = (dia%365)/30;
		dia = (dia%365)%30;
		
		ler.close();
		System.out.println("Ano :"+ano+ "\n" +"Meses : "+mes+ "\n"+"Dias :"+dia);
		
		
		
		
		
	}

}
