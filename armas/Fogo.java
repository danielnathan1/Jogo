package armas;

import java.util.Random;

public class Fogo implements ArmaIF{

	@Override
	public int usarArma() {
		
		descricao();

		int dano = 20;
		
		Random gerador = new Random();
		
		System.out.println("Fogo: Dracarys");
		
		dano*= gerador.nextInt(5);
		if(dano==0)
			dano= 20;
		
		System.out.println("\n\n\tDano causado=" + dano);
		
		return dano;
	}

	@Override
	public void descricao() {
		System.out.println("\n\n\tFogo do Dragao\ndescricao:De acordo com as lendas o fogo do dragao alado foi aquele que criou o propio sol"
				+ "certo, \ndano:20-80");
		
		
	}



}
