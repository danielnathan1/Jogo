package personagens;

public class LutSUMO extends Personagem implements Faladores, Corredores{

	@Override
	public void desenhar() {
		System.out.println("Lutador de Sumo desenhando");
		
	}

	@Override
	public void falar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void correr() {
		System.out.println("Rolando");
		
	}

}