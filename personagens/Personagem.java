package personagens;

import armas.ArmaIF;

public abstract class Personagem{
	
	ArmaIF arma;
	int vida =100;
	
	public abstract void desenhar();
	
	public int arma(){
		return arma.usarArma();
	}
	
	public void setArma(ArmaIF arma) {
		this.arma = arma;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
		
	
}
