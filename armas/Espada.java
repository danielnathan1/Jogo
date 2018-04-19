package armas;

import java.util.Random;

public class Espada implements ArmaIF{

	@Override
	public int usarArma() {
		int dano=20;
		
		Random gerador = new Random();
		
		System.out.println("Ataque: FireBall!!");
		dano*=gerador.nextInt(3);
		if(dano==0){
			dano = 10;
		}
		System.out.println("\n\n\tDano causado=" + dano);
		
		return dano;
	}

	@Override
	public void descricao() {
		// TODO Auto-generated method stub
		
	}

}
