package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	/**
	 * 
	 */

	private JPanel panel = new JPanel();
	private JLabel label = new JLabel("Test");

	public Fenetre(){

		this.setTitle("Paul > All");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		//Ajoute le bouton Rechercher
		JButton boutonFiltrer = addBouton("Rechercher");
		panel.add(boutonFiltrer);
		
		panel.setLayout(null);

		this.getContentPane().add(panel);
	}

	//Méthode pour ajouter un bouton
	private JButton addBouton(String text) {
		JButton bouton = new JButton(text);
		bouton.setBounds(10, 10, 125, 25);
		return bouton;
	}
}