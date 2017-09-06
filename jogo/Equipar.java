package jogo;

import java.util.Scanner;

import armas.*;
import armas.Desarmado;
import personagens. *;

public class Equipar {
	

	public ArmaIF aramaPer(){
			
			Scanner leitor2 = new Scanner(System.in);
			ArmaIF arma1;
			
			
			System.out.println("\t\t----------------------------------------ARMAS\t\t----------------------------------------");
			System.out.println("\n\n\n[1]DESARMADO\t\n[2]FACA\n[3]FUZIL\n[4]REVOLVER");
			
			String opArma1 = leitor2.nextLine();
			
			switch (opArma1) {
			case "1":
				arma1 = new Desarmado();
				arma1.descricao();
				
				return arma1;
			case "2":
				arma1 = new Faca();
				arma1.descricao();
				
				return arma1;
			case "3":
				arma1 = new Fuzil();
				arma1.descricao();

				return arma1;
			case "4":
				arma1 = new Revolver();
				arma1.descricao();
		
				return arma1;
				
			case "00121":
				arma1 = new Magia();
				arma1.descricao();
		
				return arma1;
				
				
				
			default:
				System.out.println("\nARMA PADRÃO= DESARMADO");
				
				arma1 = new Desarmado();
				arma1.descricao();
				
				return arma1;
			

			}
	}
}
