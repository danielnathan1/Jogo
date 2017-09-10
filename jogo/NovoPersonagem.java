package jogo;
import java.util.Scanner;

import armas.*;
import personagens.*;

public class NovoPersonagem {
	
	public Personagem criarpersoangem(){
		
		ArmaIF arma;
		Personagem p;
		
		
		System.out.println("\nESCOLHA UMA CLASSE"
				+ "\n[1]SOLDADO\n[2]GENERAL\n[3]LUTADOR DE SUMO\n[4]MAGO\n-");
		
		Scanner leitor = new Scanner(System.in);
		String op = leitor.nextLine();
		
		switch (op) {
		case "1":
			System.out.println("\nSOLDADO CRIADO!! \n\n\t\t\tHORA DE ESCOLHER UMA ARMA!");
			
			p = new Soldado();
			
			return p;
			
		case "2":
			System.out.println("\nGENERAL CRIADO!! \n\n\t\tHORA DE ESCOLHER UMA ARMA!");
			
			p = new General();
			
			return p;
			
		case "3":
			System.out.println("\nLUTADOR DE SUMO CRIADO!! \n\n\t\tHORA DE ESCOLHER UMA ARMA!");
			
			p = new LutSUMO();
			
			return p;
			
		case "4":
			System.out.println("\nMAGO CRIADO!! \n\nOBS:MAGO TEM MAGIA COMO ARMA INICIAL SE QUISER DEIXAR BASTA DIGITAR O NUMERO 00121\n\n\t\tHORA DO JOGO");
			
			p= new Mago();
			
			p.setArma(arma = new Magia());
			
			
			return p;
			
		default:
			System.out.println("\nO JOGO SERÁ ENCERRADO!");
			System.exit(0);
		}
		return null;
		
	}
	
	
}
