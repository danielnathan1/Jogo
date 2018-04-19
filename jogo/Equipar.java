package jogo;

import java.util.Scanner;

import armas.*;
import armas.Desarmado;
import personagens. *;

public class Equipar {
	

	public ArmaIF aramaPer(){
			
			Scanner leitor2 = new Scanner(System.in);
			ArmaIF arma1;
			
			
			System.out.println("\t\t----------------------------------------ARMAS----------------------------------------");
			System.out.println("\n\n\n[1]");
			
			String opArma1 = leitor2.nextLine();
			
			switch (opArma1) {
			
			case "1":
				arma1 = new Desarmado();
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
