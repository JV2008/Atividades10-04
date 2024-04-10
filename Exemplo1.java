package atividades1004;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Escolha um número de 1 á 3");
		int numero = ler.nextInt() ;
		
		switch (numero) {
		case 1:
			System.out.println("O numero escolhido foi 1.");
			break;
		case 2:
			System.out.println("O numero escolhido foi 2.");
			break;
		case 3:
			System.out.println("O numero escolhido foi 3.");
			break;
			default:
				System.out.println("O numero escolhido é inválido ! digite um numero de 1 á 3");
		}
	}

}
