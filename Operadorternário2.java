package atividades1004;

import java.util.Scanner;

public class Operadorternário2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double V1;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite a primeiro número");
		V1 = ler.nextDouble();
		
		String msg = V1 % 5 ==0 ? " O número é multiplo de 5 " : " O número não é multiplo de 5 ";
		System.out.println(msg);
		
	}

}
