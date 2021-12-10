package projects;

import java.util.Scanner;

public class exercicio7Lista {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Double a,b,c,d,ee,f,x,y;
		
		System.out.println("Digite a :");
		a = ler.nextDouble();
		
		System.out.println("Digite b :");
		b = ler.nextDouble();
		
		System.out.println("Digite c :");
		c = ler.nextDouble();
		
		System.out.println("Digite d :");
		d = ler.nextDouble();
		
		System.out.println("Digite e :");
		ee = ler.nextDouble();
		
		System.out.println("Digite f :");
		f = ler.nextDouble();
		
		x = (c*ee - b*f)/(a*ee - b*d);
		y = (a*f - c*d)/(a*ee - b*d);
		
		System.out.println("Valor de X :"+x+"\n" + "Valor de Y :"+y);
		
		
	}

}
