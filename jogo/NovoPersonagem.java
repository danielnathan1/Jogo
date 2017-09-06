package jogo;

import java.util.Scanner;
import personagens.*;
import armas.*;

public class NovoPersonagem {
	
	public Personagem criarpersoangem(){
		Animacao animacao = null;
		Personagem p;
		ArmaIF arma;
		System.out.println("\nESCOLHA UMA CLASSE"
				+ "\n[1]SOLDADO\n[2]GENERAL\n[3]LUTADOR DE SUMO\n[4]MAGO\n-");
		
		Scanner leitor = new Scanner(System.in);
		String op = leitor.nextLine();
		
		switch (op) {
		case "1":
			System.out.println("\nSOLDADO CRIADO!! \n\n\t\t\tHORA DE ESCOLHER UMA ARMA!");
			p = new Soldado();
			
			break;
		case "2":
			System.out.println("\nGENERAL CRIADO!! \n\n\t\tHORA DE ESCOLHER UMA ARMA!");
			p = new General();
			break;
		case "3":
			System.out.println("\nLUTADOR DE SUMO CRIADO!! \n\n\t\tHORA DE ESCOLHER UMA ARMA!");
			p = new LutSUMO();
			break;
		case "4":
			System.out.println("\nMAGO CRIADO!! \n\nOBS:MAGO SO PODE TER COMO ARMA INICIAL MAGIA\n\n\t\tHORA DO JOGO");
			p= new Mago();
			p.setArma(arma =new Magia());
			break;
		default:
			System.out.println("\nO JOGO SERÁ ENCERRADO!");
			System.exit(0);
		}
		
		animacao.clear();
		System.out.println("\t\t----------------------------------------ARMAS\t\t----------------------------------------");
		System.out.println("\n\n\n[1]DESARMADO\n[2]FACA\n[3]FUZIL\n[4]REVOLVER");
		
		
	}
	
	
}
