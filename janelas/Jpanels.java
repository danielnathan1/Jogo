package janelas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sun.javafx.iio.ImageMetadata;
import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class Jpanels extends JFrame{
	
	
	
	public Font font = new Font("ARIAL", Font.BOLD, 20);
	
	
	//paineis
	public JPanel jmenu = new JPanel();
	public JPanel jcriarPerso = new JPanel();
	public JPanel jluta = new JPanel();
	
	//variavel de controle de troca de telas
	public String controle = "0";
	
	
	//atributo para escolher a classe e nome, e ser passado na criacao de um novo persoangem
	public String classe = "";
	public String nomePerso = "";
	
	
	
	
	
	public JPanel mudarTelaMenu(){
		
		this.controle= "MenuPrincipal";
		
		//botao iniciar
		JButton jbIniciar = new JButton("START");
		jbIniciar.setEnabled(true);
		jbIniciar.setBounds(325, 310, 100, 40);
		jbIniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Criação do personagem");
				controle = "criacaoPerso";
				
			}
		});
		
		
		//botão sair
		JButton jbSair = new JButton("EXIT");
		jbSair.setEnabled(true);
		jbSair.setBounds(325, 510, 100, 20);
		jbSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Obrigado por Jogar!");
				System.exit(0);
				
			}
		});
		
		
		
		//imagem
		JLabel telaFundo = new JLabel("");
		telaFundo.setEnabled(true);
		telaFundo.setBounds(0, 0, 800, 600);
		telaFundo.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\tela_menu_3.jpg"));

		
		jmenu.setLayout(null);
		jmenu.setBounds(10, 100, 800, 600);
		jmenu.setBackground(new Color(173,216,230));
		jmenu.setLocation(0, 0);
		
		//jbIniciar.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\icone.png"));
		
		jmenu.add(jbIniciar);
		jmenu.add(jbSair);
		jmenu.add(telaFundo);
		
		
		return jmenu;
		
	}
	
	public JPanel mudarTelaCriacaoPerso(){
		
		
		//botão sair
		JButton jbSair = new JButton("EXIT");
		jbSair.setEnabled(true);
		jbSair.setBounds(325, 530, 70, 20);
		jbSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Obrigado por Jogar!");
				System.exit(0);
				
			}
		});
		
		//botao selecionar o personagem
		JButton jbContinuar = new JButton("CONTINUE");
		jbContinuar.setEnabled(true);
		jbContinuar.setBounds(312, 475, 100, 20);	
		
		//checks para escolha da classe
		
		//check mago
		JRadioButtonMenuItem jrbMago = new JRadioButtonMenuItem();
		jrbMago.setEnabled(true);
		jrbMago.setBackground(null);
		jrbMago.setBounds(60, 400, 20, 20);
		
		
		//check warrior
		JRadioButtonMenuItem jrbWarrior = new JRadioButtonMenuItem();
		jrbWarrior.setEnabled(true);
		jrbWarrior.setBackground(null);
		jrbWarrior.setBounds(250, 400, 20, 20);
		
		//tratamento para so poder escolher 1 classe
		jrbMago.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jrbWarrior.isSelected())
					jrbWarrior.setSelected(false);
				
				
			}
		});
		
		jrbWarrior.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jrbMago.isSelected())
					jrbMago.setSelected(false);
				
			}
		});
		
		
		//label que armazenarar os itens
		JLabel telaCriacao = new JLabel("");
		telaCriacao.setEnabled(true);
		telaCriacao.setBounds(0, 0, 800, 600);
		telaCriacao.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\tela_criacao_perso.jpg"));
		
		
		
		
		//texto para o nome do personagem
		JTextField txnome = new JTextField();
		txnome.setEnabled(true);
		txnome.setText("");
		txnome.setBounds(130, 450, 400, 20);
		
		
		//imagem
		
		
		//texto
		JLabel txnomearea= new JLabel("Nome: ");
		txnomearea.setEnabled(true);
		txnomearea.setForeground(Color.BLACK);
		txnomearea.setBounds(80, 410, 100, 100);
		

		//label para exibir os persoangens
			//mago
		JLabel gifMago = new JLabel();
		gifMago.setEnabled(true);
		gifMago.setBounds(70, 200, 160, 220);
		gifMago.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\personagens\\wizard.gif"));
			
			//warrior
		JLabel gifWarrior = new JLabel();
		gifWarrior.setEnabled(true);
		gifWarrior.setBounds(230, 130 , 200, 290);
		gifWarrior.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\personagens\\warrior.gif"));
		
		
		
		
		
		//label que serar retornada
		jcriarPerso.setLayout(null);
		jcriarPerso.setBounds(10, 100, 800, 600);
		jcriarPerso.setBackground(new Color(173,216,230));
		jcriarPerso.setLocation(0, 0);
		
		
		
		//ouvinte do botao continuar
				jbContinuar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if((jrbMago.isSelected() || jrbWarrior.isSelected())&& !txnome.getText().equals("")){
							
							nomePerso = txnome.getText();
							
							
							if(jrbMago.isSelected())
								classe = "mg";
							else
								classe = "wr";
							
															
						}else if(!(jrbMago.isSelected() || jrbWarrior.isSelected())){
							JOptionPane.showMessageDialog(null, "Você deve escolher Uma Classe!");
						}else if(txnome.getText().equals(""))
							JOptionPane.showMessageDialog(null, "Você deve escolher um nome para seu Persoangem!");
						
					}
				});
				
		
		
		//adicionando os itens na label telacriacao para poder assim utilizar a imagem de fundo sem problemas
		telaCriacao.add(txnome);
		telaCriacao.add(txnomearea);
		telaCriacao.add(jbContinuar);
		telaCriacao.add(jrbMago);
		telaCriacao.add(jrbWarrior);
		telaCriacao.add(gifMago);
		telaCriacao.add(gifWarrior);
		
		
		//adicionando os itens a label que sera retornada
		jcriarPerso.add(jbSair);
		jcriarPerso.add(telaCriacao);
		
		return jcriarPerso;
		
	}

	public JPanel mudarTelaluta(){
		
		JButton jbatacar = new JButton("ATACK");
		jbatacar.setEnabled(true);
		jbatacar.setBounds(60, 550, 100, 15);
		
		
		
		JLabel tela = new JLabel();
		tela.setEnabled(true);
		tela.setBounds(0, 0, 800, 600);
		tela.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\tela_luta.jpg"));
		
		
		//gif do dragao
		JLabel gifdrag = new JLabel();
		gifdrag.setEnabled(true);
		gifdrag.setBounds(400, 100, 500, 500);
		gifdrag.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\drag.gif"));
		
		//gif do personagem
		JLabel gifMago = new JLabel();
		gifMago.setEnabled(true);
		gifMago.setBounds(100, 380, 200, 200);
		gifMago.setIcon(new ImageIcon("jogo\\jogo\\Imagens\\personagens\\luta\\mg.gif"));
		
		jluta.setLayout(null);
		jluta.setBounds(10, 100, 800, 600);
		jluta.setBackground(new Color(173,216,230));
		jluta.setLocation(0, 0);
		//
		tela.add(gifdrag);
		tela.add(gifMago);
		tela.add(jbatacar);
		
		
		
		//
		
		jluta.add(tela);
		
		
		return jluta;
		
	}
	
}
