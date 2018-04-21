package personagens;

import javax.swing.JOptionPane;

import armas.Cajado;

//Mago herda de personagem e implementa de faladores e corredores
public class Mago extends Personagem{
	
	Cajado cajado;
	
	@Override
	public void aprensentacao(String nomeperso) {
		JOptionPane.showMessageDialog(null, "\t\tNome:" + nomeperso +"\nClasse:Mago\n\nVida:100\nMana:100\nArma:Cajado\nSkills:Water Tiger");
		
	}
	public Mago(){
		this.setArma(cajado);
	}


}
