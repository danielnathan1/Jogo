package jogo;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import janelas.TelaInicial;

public class Animacao {
	
	public static void sleep(){
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	JPanel painelControle= new JPanel();
	
	
	public void cutsceneInicial(TelaInicial tela){
		JOptionPane.showMessageDialog(null, "O reino de Oligath\nConhecido pelo seu grande poder economico\n e Seu rei Oligan XII");
		//tela.add(comp)
		JOptionPane.showMessageDialog(null, "");
		
	}
	
	
			
}
