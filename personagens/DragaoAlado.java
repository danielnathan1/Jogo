package personagens;

import armas.ArmaIF;


//DragaoAlado herda de Personagem e implementa de voadores
public class DragaoAlado extends Personagem implements Voadores{

	@Override
	public void desenhar() {
		System.out.println("Dragao Desenhando");
		
	}

	@Override
	public void voar() {
		// TODO Auto-generated method stub
		
	}
	
	
}
