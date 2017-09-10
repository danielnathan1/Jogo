package armas;

import java.util.Random;


//Magia implementa de Arma
public class Magia implements ArmaIF {

	@Override
	public int usarArma() {
		int dano = 30;
		
		System.out.println("Magia: You shall not pass!!");
		
		Random gerador = new Random();
		
		dano *= gerador.nextInt(3);
		
		if(dano==0){
			dano = 30;
		}
		System.out.println("\n\n\tDano causado=" + dano);
		return dano;
	
		
	}

	@Override
	public void descricao() {
		System.out.println("\n\n\tMAGIA\ndescricao:E criada e lancada uma grande bola de fogo,ao chegar perto do alvo"
				+ " uma grande massa de ar é lancada para criar uma explosao no alvo\ndano:30-60");
		
	}


}
