package personagens;

import armas.ArmaIF;

public abstract class Personagem{
	
	ArmaIF arma;
	int vida =100;
	int mana =100;
	
	
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

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	
	
		
	
}
