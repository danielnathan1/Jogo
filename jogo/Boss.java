package jogo;

import java.util.Scanner;

public class Boss {
	
	Animacao animacao;
	
	public void luta(){
		System.out.println("\nHUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println("\nLOCUTOR: o dragão alado que protege a terra está sendo controlado por uma força nao conhecida, detenha-o antes que seja tarde demais"
				+ " ");
		
		animacao.sleep();
	}
	
	public String decisao(){
		String op;
		System.out.println("[1]ATACAR,\n[2]TROCAR DE ARMA,\n[QUALQUER TECLA]FUGIR\n");
		Scanner leitor = new Scanner(System.in);
		return op= leitor.nextLine();
	}
	
	public void baforadaDoDragao(){
		System.out.println("\n\nO dragao percebeu o seu golpe e rapidamente subiu ao ceus quase tão rapido que nao dava pra acreditar como"
				+ "\nalgo tao grande poderia ser tao rapido, e do alto ele lança uma rajada de fogo em sua direcao!");
	}
	
	public void checarvitoria(){
		
			
	}
	
}
