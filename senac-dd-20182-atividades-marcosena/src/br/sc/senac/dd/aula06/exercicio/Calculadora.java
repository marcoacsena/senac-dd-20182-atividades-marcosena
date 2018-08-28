package br.sc.senac.dd.aula06.exercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora extends JFrame {

	private JPanel pnlExterno;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtVisor;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 465);
		pnlExterno = new JPanel();
		pnlExterno.setBackground(new Color(32, 178, 170));
		pnlExterno.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlExterno);
		
		txtVisor = new JTextField();
		txtVisor.setHorizontalAlignment(SwingConstants.CENTER);
		txtVisor.setEditable(false);
		txtVisor.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtVisor.setBounds(71, 33, 237, 45);
		pnlExterno.add(txtVisor);
		txtVisor.setColumns(10);
		
		txtNumero1 = new JTextField();
		txtNumero1.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtNumero1.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				double num1 = e.getKeyCode();
			}
		});
		txtNumero1.setBounds(111, 117, 48, 45);
		txtNumero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("N\u00FAmero 1");
		lblNumero1.setBounds(30, 129, 71, 20);
		lblNumero1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNumero2 = new JLabel("N\u00FAmero 2");
		lblNumero2.setBounds(199, 129, 71, 20);
		lblNumero2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		txtNumero2 = new JTextField();
		txtNumero2.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtNumero2.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumero2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				double num2 = e.getKeyCode();
			}
		});
		txtNumero2.setBounds(281, 117, 48, 45);
		txtNumero2.setColumns(10);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double valor1 = Double.parseDouble(txtNumero1.getText());
				double valor2 = Double.parseDouble(txtNumero2.getText());
				double soma = valor1 + valor2;
				txtVisor.setText(soma +"");
			
				
			}
		});
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSoma.setBounds(102, 209, 60, 45);
		
		JButton btnSubtracao = new JButton("_");
		btnSubtracao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double valor1 = Double.parseDouble(txtNumero1.getText());
				double valor2 = Double.parseDouble(txtNumero2.getText());
				double subtracao = valor1 - valor2;
				txtVisor.setText(subtracao +"");
				
			}
		});
		
		btnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubtracao.setBounds(200, 209, 60, 45);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double valor1 = Double.parseDouble(txtNumero1.getText());
				double valor2 = Double.parseDouble(txtNumero2.getText());
				double divisao = valor1 / valor2;
				txtVisor.setText(divisao +"");
				
			}
		});
		
		btnDivisao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivisao.setBounds(102, 290, 60, 45);
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnMultiplicacao = new JButton("*");
		
		btnMultiplicacao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double valor1 = Double.parseDouble(txtNumero1.getText());
				double valor2 = Double.parseDouble(txtNumero2.getText());
				double multiplicacao = valor1 * valor2;
				txtVisor.setText(multiplicacao +"");
				
			}
		});
		btnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMultiplicacao.setBounds(200, 290, 60, 45);
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pnlExterno.setLayout(null);
		pnlExterno.add(btnSoma);
		pnlExterno.add(btnDivisao);
		pnlExterno.add(lblNumero1);
		pnlExterno.add(lblNumero2);
		pnlExterno.add(txtNumero1);
		pnlExterno.add(txtNumero2);
		pnlExterno.add(btnSubtracao);
		pnlExterno.add(btnMultiplicacao);
		
		JButton btnLimparVisor = new JButton("Limpar");
		btnLimparVisor.setForeground(new Color(255, 0, 0));
		btnLimparVisor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLimparVisor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				txtVisor.setText(null);
				txtNumero1.setText(null);
				txtNumero2.setText(null);
			}
		});
		btnLimparVisor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLimparVisor.setBounds(140, 359, 109, 57);
		pnlExterno.add(btnLimparVisor);
		
		
	}
}
