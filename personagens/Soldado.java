package personagens;


//Soldado herda de personagem e implementa de faladores e corredores
public class Soldado extends Personagem implements Faladores, Corredores{
	
	
	@Override
	public void desenhar() {
		System.out.println("Soldado desenhando");
		
	}

	@Override
	public void falar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}

	

}
