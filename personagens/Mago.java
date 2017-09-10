package personagens;

//Mago herda de personagem e implementa de faladores e corredores
public class Mago extends Personagem implements Faladores , Corredores{

	@Override
	public void desenhar() {
		System.out.println("Desenhando com Magia");
		
	}

	@Override
	public void falar() {
		System.out.println("Mago falando!");
		
	}

	@Override
	public void correr() {
		System.out.println("Teleportando");
		
	}
	

}
