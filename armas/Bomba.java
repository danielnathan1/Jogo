package armas;


public class Bomba implements ArmaIF{

	@Override
	public int usarArma() {
		int dano=40;
		System.out.println("bomba: GRANADAAAAAAAAAAA");
		
		System.out.println("\n\n\tDano causado=" + dano);
		
		return dano;
		
	}

	@Override
	public void descricao() {
		System.out.println("\n\n\tBOMBA\ndescricao:Granada \ndano:40");
		
	}
	
}
