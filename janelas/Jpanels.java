package janelas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;

import com.sun.javafx.iio.ImageMetadata;

public class Jpanels extends JFrame{
	
	
	
	public Font font = new Font("ARIAL", Font.BOLD, 20);

	public JPanel jmenu = new JPanel();
	
	
	
	
	public JPanel mudarTela(){
		
		//botao iniciar
		JButton jbIniciar = new JButton("Iniciar");
		jbIniciar.setEnabled(true);
		jbIniciar.setBounds(325, 310, 100, 40);
		
		JButton jbSair = new JButton("Sair");
		jbSair.setEnabled(true);
		jbSair.setBounds(325, 410, 100, 40);
		
		//imagem
		JLabel telaFundo = new JLabel("");
		telaFundo.setEnabled(true);
		telaFundo.setBounds(0, 0, 800, 600);
		telaFundo.setIcon(new ImageIcon("C:\\Users\\danie\\Documents\\faculdade\\P4\\Java avancado\\Exercicios\\Jogo\\Jogo\\Imagens\\tela_inicial.jpg"));

		
		jmenu.setLayout(null);
		jmenu.setBounds(10, 100, 800, 600);
		jmenu.setBackground(new Color(173,216,230));
		jmenu.setLocation(0, 0);
		
		//titulo
		JLabel jTitulo = new JLabel("Menu");
		jTitulo.setBounds(300, 0, 200, 20);
		jTitulo.setFont(font);
		jTitulo.setForeground(Color.BLACK);
		jTitulo.setToolTipText("Menu");
		
		jmenu.add(jbIniciar);
		jmenu.add(jbSair);
		jmenu.add(telaFundo);
		
		
		return jmenu;
		
	}
	
	
}
