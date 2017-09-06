package armas;

import java.util.Random;

public class Desarmado implements ArmaIF{

	@Override
	public int usarArma() {
		int dano=20;
		System.out.println("Desarmado: Punhos de aço!!");
		
		Random gerador = new Random();
		
		dano *= gerador.nextInt(6);
		
		System.out.println("\n\n\tDano causado=" + dano);
		return dano;
		
	}

	@Override
	public void descricao() {
		System.out.println("\n\n\tDESARMADO\ndescricao: a verdadeira focar de um guerreiro esta em seus punhos\ndando:0-100");
		
	}
	

}
