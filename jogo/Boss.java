package jogo;

import java.util.Scanner;

public class Boss {
	
	Animacao animacao = new Animacao();
	
	public void luta(){
		System.out.println("\nHUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUAAAAAAAAAAAAAAAAAAAAAA");
		System.out.println("\nLOCUTOR: o dragão alado que protege a terra está sendo controlado por uma força nao conhecida, detenha-o antes que seja tarde demais");
		
		animacao.sleep();
	}
	
	public int decisao(){
		int op;
		System.out.println("[1]ATACAR,\n[2]TROCAR DE ARMA,\n[QUALQUER TECLA]FUGIR\n");
		Scanner leitor = new Scanner(System.in);
		return op= leitor.nextInt();
	}
	
	public void baforadaDoDragao(){
		System.out.println("\n\nO dragao percebeu o seu golpe e rapidamente subiu ao ceus quase tão rapido que nao dava pra acreditar como"
				+ "\nalgo tao grande poderia ser tao rapido, e do alto ele lança uma rajada de fogo em sua direcao!");
	}
	
	public void bossDerrotado(){
		System.out.println("\nLOCUTOR: o seu ultimo ataque conseguiu acordar o dragao ao perceber oque fez , ele olhou diretamente para voce,"
				+ "com um olhar de agradecimento, e um sentimento de arrependimento, e voou ao sul ate que n fosse mais possivel o ver");
		
		
		
	}
	
	
}
