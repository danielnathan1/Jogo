package armas;

import java.util.Random;

public class Cajado implements ArmaIF{

	@Override
	public int usarArma() {
		int dano=10;
		
		Random gerador = new Random();
		
		System.out.println("Ataque: FireBall!!");
		dano*=gerador.nextInt(7);
		if(dano==0){
			dano = 10;
		}
		System.out.println("\n\n\tDano causado=" + dano);
		
		return dano;

	}

	@Override
	public void descricao() {
		System.out.println("\n\nArma usada por aqueles que portam o poder da magia de sillam");
		
	}

}
