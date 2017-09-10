package personagens;



//General herda de personagem e implementa de faladores e corredores
public class General extends Personagem implements Faladores, Corredores{


	@Override
	public void desenhar() {
		System.out.println("General Desenhando");
		
	}

	@Override
	public void falar() {
		
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}


}
