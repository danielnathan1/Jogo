package personagens;

import armas.Cajado;

//Mago herda de personagem e implementa de faladores e corredores
public class Mago extends Personagem{
	
	Cajado cajado;
	
	public Mago(){
		this.setArma(cajado);
	}

	@Override
	public void aprensentacao() {
		// TODO Auto-generated method stub
		
	}

}
