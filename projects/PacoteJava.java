package projects;

import java.util.Scanner;

public class PacoteJava {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int idade;
		String nome;
		
		System.out.println("Digite seu nome :");
		nome = ler.nextLine();
		
		
		System.out.println("Digite sua idade :");
		idade = ler.nextInt();
		
		System.out.printf("Seu nome: "+nome+"\n");
		System.out.printf("Sua idade: "+idade+"\n");
		
		if(idade >= 18) {
			
			System.out.println("Você é maior de idade");
		}else if (idade < 18) {
			
			System.out.println("Você é menor de idade");
		}else {
			
			System.out.println("Você digitou um valor inválido");
		}
		
	}
}
