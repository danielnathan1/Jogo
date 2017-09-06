package personagens;

import armas.ArmaIF;

public abstract class Personagem{
	
	ArmaIF arma;
	
	public abstract void desenhar();
	public void arma(){
		arma.usarArma();
	}
	
	public void setArma(ArmaIF arma) {
		this.arma = arma;
	}
	
	
		
	
}
