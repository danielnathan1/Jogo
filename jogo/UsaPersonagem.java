package jogo;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import armas.*;
import janelas.Jpanels;
import janelas.TelaInicial;
import personagens.*;

public class UsaPersonagem {
	
	
	public static void main(String[] args){
		
		//interface
		Container c = new Container();
		c.setBounds(10, 100, 800, 600);
		c.setBackground(new Color(173,216,230));
		c.setLocation(0,0);
		
		//paineis para troca de tela
		Jpanels paineis = new Jpanels();
		c.add(paineis.mudarTelaMenu());
		
		//iniciando o frame
		TelaInicial jtelainicial = new TelaInicial(c);
		jtelainicial.repaint();
		jtelainicial.add(c);
		
		//personagem que sera criado
		Personagem personagem;
		
		//controle de execução
		while(paineis.controle != "0"){
			System.out.println("aqui");
			
			
			switch (paineis.controle) {
			
			case "criacaoPerso":
				System.out.println("aquicriacao");
				jtelainicial.mudarPanel(c, paineis.mudarTelaCriacaoPerso());
				jtelainicial.repaint();
				
				while(paineis.controle == "criacaoPerso"){
				System.out.println("ali");
					if(paineis.classe=="mg"){
						personagem = new Mago();
						personagem.setNome(paineis.nomePerso);
						personagem.aprensentacao(personagem.getNome());
						paineis.controle = "Luta";
						
						
					}else if(paineis.classe == "wr"){
						personagem = new Guerreiro();
						personagem.setNome(paineis.nomePerso);
						System.out.println(personagem.getNome());
						paineis.controle = "Luta";
					}
				
				}
				break;
				
			case "Luta":
				System.out.println("ali, luta");
				jtelainicial.mudarPanel(c, paineis.mudarTelaluta());
				jtelainicial.repaint();
				while(paineis.controle == "Luta"){
					System.out.println("ali, luta, oh");
				}
				
				
				break;

			default:
				break;
			}
			
		}
		
		
		
	
	}
	
	
}
