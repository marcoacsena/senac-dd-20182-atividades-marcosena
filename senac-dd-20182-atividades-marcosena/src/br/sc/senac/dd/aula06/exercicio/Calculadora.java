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

public class Calculadora extends JFrame {

	private JPanel pnlExterno;
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
		setBounds(100, 100, 450, 465);
		pnlExterno = new JPanel();
		pnlExterno.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlExterno);
		
		JPanel pnlBordaCalculadora = new JPanel();
		pnlBordaCalculadora.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLUE, null, null, null));
		GroupLayout gl_pnlExterno = new GroupLayout(pnlExterno);
		gl_pnlExterno.setHorizontalGroup(
			gl_pnlExterno.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_pnlExterno.createSequentialGroup()
					.addContainerGap(40, Short.MAX_VALUE)
					.addComponent(pnlBordaCalculadora, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
		);
		gl_pnlExterno.setVerticalGroup(
			gl_pnlExterno.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlExterno.createSequentialGroup()
					.addComponent(pnlBordaCalculadora, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
					.addGap(22))
		);
		pnlBordaCalculadora.setLayout(null);
		
		JButton btnSete = new JButton("7");
		btnSete.setBounds(11, 133, 60, 50);
		btnSete.setToolTipText("");
		btnSete.setFont(new Font("Tahoma", Font.BOLD, 30));
		pnlBordaCalculadora.add(btnSete);
		
		JButton btnOito = new JButton("8");
		btnOito.setBounds(73, 133, 60, 50);
		btnOito.setFont(new Font("Tahoma", Font.BOLD, 30));
		pnlBordaCalculadora.add(btnOito);
		
		JButton btnNove = new JButton("9");
		btnNove.setBounds(138, 133, 60, 50);
		btnNove.setFont(new Font("Tahoma", Font.BOLD, 30));
		pnlBordaCalculadora.add(btnNove);
		
		JButton btnQuatro = new JButton("4");
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnQuatro.setToolTipText("");
		btnQuatro.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnQuatro.setBounds(11, 186, 60, 50);
		pnlBordaCalculadora.add(btnQuatro);
		
		JButton btnCinco = new JButton("5");
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCinco.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnCinco.setBounds(73, 186, 60, 50);
		pnlBordaCalculadora.add(btnCinco);
		
		JButton btnSeis = new JButton("6");
		btnSeis.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSeis.setBounds(138, 186, 60, 50);
		pnlBordaCalculadora.add(btnSeis);
		
		JButton btnUm = new JButton("1");
		btnUm.setToolTipText("");
		btnUm.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnUm.setBounds(11, 239, 60, 50);
		pnlBordaCalculadora.add(btnUm);
		
		JButton btnDois = new JButton("2");
		btnDois.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDois.setBounds(73, 239, 60, 50);
		pnlBordaCalculadora.add(btnDois);
		
		JButton btnTres = new JButton("3");
		btnTres.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnTres.setBounds(138, 239, 60, 50);
		pnlBordaCalculadora.add(btnTres);
		
		JButton btnZero = new JButton("0");
		btnZero.setToolTipText("");
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnZero.setBounds(11, 292, 60, 50);
		pnlBordaCalculadora.add(btnZero);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPonto.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPonto.setBounds(73, 292, 60, 50);
		pnlBordaCalculadora.add(btnPonto);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setForeground(Color.RED);
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnIgual.setBounds(138, 292, 60, 50);
		pnlBordaCalculadora.add(btnIgual);
		
		JButton btnMultiplicacao = new JButton("X");
		btnMultiplicacao.setForeground(Color.BLACK);
		btnMultiplicacao.setBackground(Color.WHITE);
		btnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMultiplicacao.setBounds(200, 132, 60, 50);
		pnlBordaCalculadora.add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDivisao.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnDivisao.setBounds(200, 186, 60, 50);
		pnlBordaCalculadora.add(btnDivisao);
		
		JButton btnMenos = new JButton("-");
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnMenos.setBounds(200, 239, 60, 50);
		pnlBordaCalculadora.add(btnMenos);
		
		JButton btnSoma = new JButton("+");
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSoma.setBounds(200, 292, 60, 50);
		pnlBordaCalculadora.add(btnSoma);
		
		JButton btnPercentagem = new JButton("%");
		btnPercentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnPercentagem.setToolTipText("");
		btnPercentagem.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPercentagem.setBounds(11, 80, 60, 50);
		pnlBordaCalculadora.add(btnPercentagem);
		
		JButton btnAbreParentese = new JButton("(");
		btnAbreParentese.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnAbreParentese.setBounds(73, 80, 60, 50);
		pnlBordaCalculadora.add(btnAbreParentese);
		
		JButton btnFechaParentese = new JButton(")");
		btnFechaParentese.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnFechaParentese.setBounds(138, 80, 60, 50);
		pnlBordaCalculadora.add(btnFechaParentese);
		
		JButton btnLimparVisor = new JButton("C");
		btnLimparVisor.setForeground(Color.BLACK);
		btnLimparVisor.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnLimparVisor.setBackground(Color.WHITE);
		btnLimparVisor.setBounds(200, 80, 60, 50);
		pnlBordaCalculadora.add(btnLimparVisor);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(5, 17, 273, 64);
		pnlBordaCalculadora.add(panel_1);
		panel_1.setLayout(null);
		
		txtVisor = new JTextField();
		txtVisor.setBounds(5, 16, 249, 37);
		panel_1.add(txtVisor);
		txtVisor.setColumns(10);
		pnlExterno.setLayout(gl_pnlExterno);
	}
}
