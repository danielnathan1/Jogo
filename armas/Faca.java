package armas;

import java.util.Random;

public class Faca implements ArmaIF{

	@Override
	public int usarArma() {
		int dano=10;
		
		Random gerador = new Random();
		
		System.out.println("Faca AK47: a faca perfeita para combate");
		dano*=gerador.nextInt(7);
		if(dano==0){
			dano = 10;
		}
		System.out.println("\n\n\tDano causado=" + dano);
		
		return dano;
		
		
	}

	@Override
	public void descricao() {
		System.out.println("\n\n\tFACA\ndescricao:Uma faca bem utilizada pode ser capaz de atingir o ponto"
				+ "certo, \ndano:10-60 ");
		
	}

}
