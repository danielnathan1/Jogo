package personagens;

import armas.ArmaIF;

public abstract class Personagem{
	
	public ArmaIF arma;
	public String nome;
	public int vida =100;
	public int mana =100;
	
	
	public abstract void aprensentacao();
		


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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
		
	
}
