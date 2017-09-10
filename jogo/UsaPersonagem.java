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
		int opluta=0;
		
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
			
			animacao.sleep();
			animacao.carregamento();
			
			
			
			System.out.println("\t\t----------------------------------------BOSS----------------------------------------\n\n");
			animacao.carregamento();
			boss.luta();
			animacao.dragao();
			opluta = boss.decisao();
			
			do{
				
			
				switch (opluta) {
				
					case 1:
						dragao.setVida(dragao.getVida()-personagem.arma());
						animacao.sleep();
						break;
						
					case 2:
						personagem.setArma(equip.aramaPer());
						
						break;
	
						
					default:
						System.exit(0);
				}
				
				
				if(dragao.getVida() <= 0){
					boss.bossDerrotado();
					System.out.println("\n\t\tPARABENS\n\n\n\tVOCE CONSEGUIU PARAR O DRAGAO ALADO");
					System.exit(0);
				}
				
				if(opluta!=2){
					boss.baforadaDoDragao();
					personagem.setVida(personagem.getVida() - dragao.arma());
				}
				
				
				System.out.println("\n\n VIDA DO DRAGAO: " + dragao.getVida());
				System.out.println("\n\n SUA VIDA: " + personagem.getVida());
				
				
				if(personagem.getVida() <= 0){
					System.out.println("\nSUA VIDA CHEGOU A ZERO, VOCE MORREU\n\n\t\tGAME OVER");
					System.exit(0);
				}
				
				
				
				opluta = boss.decisao();
			
			}while(personagem.getVida()!=0 || dragao.getVida() !=0);	
		}
	}
	
	
}
