package atividades1004;

import java.util.Scanner;

public class Teste1004 {

	public static void main(String[] args) {
		double V1;
		Scanner ler = new Scanner (System.in);
		System.out.println("Digite a quantia de anos que você trabalha");
		V1 = ler.nextDouble();
		
		String tblh = V1 <=3 ? " Seu bonûs é de 5% " : " Seu bonûs é de 7% ";
		System.out.println(tblh);

	}

}
