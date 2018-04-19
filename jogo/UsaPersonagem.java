package jogo;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JLabel;

import armas.*;
import janelas.Jpanels;
import janelas.TelaInicial;
import personagens.*;

public class UsaPersonagem {
	
	
	public static void main(String[] args){
		
		//interface
		Container c = new Container();
		c.setBounds(10, 100, 800, 600);
		c.setBackground(new Color(173,216,230));
		c.setLocation(0,0);
		
		
		Jpanels paineis = new Jpanels();
		c.add(paineis.mudarTela());
		
		TelaInicial jtelainicial = new TelaInicial(c);
		jtelainicial.repaint();
		jtelainicial.add(c);
		
		
		
	
	}
	
	
}
