package jogo;
import java.util.Scanner;

import armas.*;
import personagens.*;

public class NovoPersonagem {
	
	public Personagem criarpersoangem(){
		
		Personagem p;
		
		
		System.out.println("\nESCOLHA UMA CLASSE"
				+ "\n[1]MAGO\n[2]GUERREIRO\n\n-");
		
		Scanner leitor = new Scanner(System.in);
		String op = leitor.nextLine();
		
		switch (op) {
		case "1":
			System.out.println("\nMAGO CRIADO!! \n\n\t\t\t");
			
			p = new Mago();
			
			return p;
			
		case "2":
			System.out.println("\nGUERREIRO CRIADO!! \n\n\t\t");
			
			p = new Guerreiro();
			
			return p;
			
		default:
			System.out.println("\nO JOGO SERÁ ENCERRADO!");
			System.exit(0);
		}
		return null;
		
	}
	
	
}
