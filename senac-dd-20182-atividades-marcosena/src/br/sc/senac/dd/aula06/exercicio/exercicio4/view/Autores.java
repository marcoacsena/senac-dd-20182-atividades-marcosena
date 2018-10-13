package br.sc.senac.dd.aula06.exercicio.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import java.awt.Color;

public class Autores extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autores frame = new Autores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Autores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane dtrpnSistemaDesenvolvidoPor = new JEditorPane();
		dtrpnSistemaDesenvolvidoPor.setForeground(new Color(255, 255, 255));
		dtrpnSistemaDesenvolvidoPor.setBackground(new Color(119, 136, 153));
		dtrpnSistemaDesenvolvidoPor.setText("Sistema desenvolvido por Marco Sena\r\n\r\nVers\u00E3o: 1.0.0\r\n\r\nFinalidade: Gest\u00E3o de Ambientes de neg\u00F3cio de supermercado.\r\n\r\nPara contato: marcoacsena@gmail.com");
		dtrpnSistemaDesenvolvidoPor.setBounds(10, 11, 414, 240);
		contentPane.add(dtrpnSistemaDesenvolvidoPor);
	}
}
