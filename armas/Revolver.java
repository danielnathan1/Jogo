package armas;

import java.util.Random;


//Revolver implementa de Arma
public class Revolver implements ArmaIF{

	@Override
	public int usarArma() {
		
		int dano = 10;
		
		Random gerador = new Random();
		
		dano *= gerador.nextInt(6);
		
		System.out.println("Revolver: o revolver e seu mas eu n vou devolver nao!");
		
		System.out.println("\n\n\tDano causado=" + dano);
		
		return dano;
		
	}

	@Override
	public void descricao() {
		System.out.println("\n\n\tREVOLVER\ndescricao:Esse revolver ta por 500 conto \ndano:0-50");
		
	}


	
}
