package armas;

import java.util.Random;

public class Fogo implements ArmaIF{

	@Override
	public int usarArma() {
		int dano=40;
		
		Random gerador = new Random();
		
		System.out.println("Ataque: FireBall!!");
		dano*=gerador.nextInt(3);
		if(dano==0){
			System.out.println("\n\nMiss");;
		}
		System.out.println("\n\n\tDano causado=" + dano);
		
		return dano;

	}

	@Override
	public void descricao() {
		// TODO Auto-generated method stub
		
	}
	

}
