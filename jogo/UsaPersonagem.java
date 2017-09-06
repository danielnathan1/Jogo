package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import armas.*;
import personagens.*;

public class UsaPersonagem {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		//
		Personagem personagem = null;
		Personagem dragao = new DragaoAlado();
		
		//
		NovoPersonagem novo =new NovoPersonagem();
		Equipar equip = new Equipar();
		//
		Animacao animacao= new Animacao();
		Boss boss= new Boss();
		
		ArmaIF arma;
		
		String op = "1";
		String opluta="";
		
		dragao.setArma(arma = new Fogo());
		
		
		
		
		while(op=="1"){
			System.out.println("\t\t----------------------------------------BEM VINDO----------------------------------------\n\n");
			System.out.println("Escolha uma opcao!!"
								+ "\n[1]-JOGAR"
								+ "\n[QUALQUER TECLA]-SAIR");
			op = leitor.nextLine();
			
			animacao.carregamento();
			
			
			System.out.println("\t\t----------------------------------------CRIACAO DO PERSONAGEM----------------------------------------\n\n");
			personagem =novo.criarpersoangem();
			animacao.carregamento();
			
			personagem.setArma(equip.aramaPer());
			
			animacao.carregamento();
			
			
			
			System.out.println("\t\t----------------------------------------BOSS----------------------------------------\n\n");
			animacao.carregamento();
			boss.luta();
			animacao.dragao();
			
			while(personagem.getVida()!=0 || dragao.getVida() !=0){
				opluta = boss.decisao();
			
				switch (opluta) {
				
					case "1":
						dragao.setVida(personagem.arma());
						animacao.sleep();
						opluta = boss.decisao();
						break;
						
					case "2":
						
						
						break;
	
						
					default:
						break;
				}
				if(opluta!="2"){
					boss.baforadaDoDragao();
					personagem.setVida(dragao.arma());
				}
			
			}	
		}
	}
	
	
}
