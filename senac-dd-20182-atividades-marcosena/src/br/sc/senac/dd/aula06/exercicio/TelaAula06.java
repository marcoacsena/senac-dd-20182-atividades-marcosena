package br.sc.senac.dd.aula06.exercicio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class TelaAula06 {

	private JFrame frmAula6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAula06 window = new TelaAula06();
					window.frmAula6.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaAula06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAula6 = new JFrame();
		frmAula6.getContentPane().setBackground(Color.GRAY);
		frmAula6.setForeground(Color.RED);
		frmAula6.setFont(new Font("Dialog", Font.BOLD, 20));
		frmAula6.setBackground(Color.RED);
		frmAula6.setTitle("Aula 06");
		frmAula6.setBounds(100, 100, 450, 300);
		frmAula6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAula6.getContentPane().setLayout(null);
		
		JLabel lblExerccio1 = new JLabel("Exerc\u00EDcio 01");
		lblExerccio1.setHorizontalAlignment(SwingConstants.CENTER);
		lblExerccio1.setBounds(0, 0, 434, 22);
		lblExerccio1.setForeground(Color.RED);
		lblExerccio1.setBackground(Color.BLACK);
		lblExerccio1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		frmAula6.getContentPane().add(lblExerccio1);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(163, 201, 93, 50);
		btnSair.setBackground(Color.ORANGE);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 18));		
		frmAula6.getContentPane().add(btnSair);
	}

}
