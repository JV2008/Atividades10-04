package atividades1004;

import java.util.Scanner;

public class Operadorternário {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double Nota1;
		double Nota2;
		double Nota3;
		double Nota4;
		double media;
		
		System.out.println("Digite a primeira nota");
		Nota1 = ler.nextDouble();
		
		System.out.println("Digite a segunda nota");
		Nota2 = ler.nextDouble();
		
		System.out.println("Digite a terceira nota");
		Nota3 = ler.nextDouble();
		
		System.out.println("Digite a quarta nota");
		Nota4 = ler.nextDouble();
		
		media = (Nota1+ Nota2+ Nota3+ Nota4) /4;
		
		String msg = media >= 7 ? " Aprovado " : " Reprovado ";
		System.out.println(msg); 
}
}