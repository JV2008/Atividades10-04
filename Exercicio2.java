package atividades1004;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	int valor;
	
	System.out.println("digite um valor de 1 á 7");
	valor = ler.nextInt();
	
	switch (valor) {
	
	case 1:
		System.out.println("Domingo");
		break;
	
	
	case 2  :
		System.out.println("Segunda-feira");
		break;
	
	case 3 :
		System.out.println("Terça-feira");
		break;
	
	case 4 :
		System.out.println("Quarta-feira");
		break;
	
	case 5 :
		System.out.println("Quinta-feira");
		break;
	
	case 6 :
		System.out.println("Sexta-feira");
		break;
	
	case 7: 
		System.out.println("Sábado");
		break;
	

	default:
		System.out.println("Dia inválido");

	}
	}	

	
}
	
	





