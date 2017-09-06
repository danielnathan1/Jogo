package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import armas.*;
import personagens.*;

public class UsaPersonagem {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Personagem personagem = null;
		NovoPersonagem novo =new NovoPersonagem();
		
		String op = "1";
		
		
		
		
		
		while(op=="1"){
			System.out.println("\t\t----------------------------------------BEM VINDO----------------------------------------\n\n");
			System.out.println("Escolha uma opcao!!"
								+ "\n[1]-JOGAR"
								+ "\n[QUALQUER TECLA]-SAIR");
			op = leitor.nextLine();
			
			
			System.out.println("\t\t----------------------------------------CRIACAO DO PERSONAGEM----------------------------------------\n\n");
			personagem =novo.criarpersoangem();
			
			
			
		}
		
		
		
		
		
		
	}
	
	
}
