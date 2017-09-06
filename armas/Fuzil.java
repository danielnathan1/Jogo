package armas;

import java.util.Random;

public class Fuzil implements ArmaIF{

	@Override
	public int usarArma() {
		int dano=10;
		int x=1;
		
		System.out.println("\nFuzil : rajada!");
		
		Random gerador = new Random();
		
		for(x=1;x<3;x++){
			
			int temp = 10*gerador.nextInt(3);
			
			dano+= temp;
			
			System.out.println("\nTIRO" + x);
			System.out.println("\nDANO ACUMULATIVO:" + dano);
			
		}
		return dano;
		
	}

	@Override
	public void descricao() {
		System.out.println("\n\n\tFUZIL\ndescricao:o fuzil da 3 tiros cada um podendo causar entre \ndano:0-20");
		
	}

}
