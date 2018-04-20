package janelas;

import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaInicial extends JFrame{
	public JPanel panel= new JPanel();
	
	
	
	public TelaInicial(Container c){
		super("Main");
		
		//dimencoes
		setBounds(10, 100, 800, 600);
		
		//
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//
		setVisible(true);
		
		//
		setResizable(true);
		
		setLocationRelativeTo(null);
		//icone
		ImageIcon icone = new ImageIcon("C:\\Users\\danie\\Documents\\faculdade\\jogo2.0\\jogo\\jogo\\Imagens\\icone.png");
		setIconImage(icone.getImage());
	
	//	conteiner
	 	
		

	}
	
	public void mudarPanel(Container c, JPanel novoPanel){
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(173,216,230));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.removeAll();
		c.add(novoPanel);
		
		
	}
	
	

}
