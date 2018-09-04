package br.sc.senac.dd.aula06.exercicio.exercicio4.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.DAO.FuncionarioDAO;
import br.sc.senac.dd.aula06.exercicio.exercicio4.model.VO.FuncionarioVO;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

public class ConsultarFuncionarioVO extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtEmail;
	private JTextField txtId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFuncionarioVO frame = new ConsultarFuncionarioVO();
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
	public ConsultarFuncionarioVO() {
		FuncionarioVO funcionarioVO = new FuncionarioVO();
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		
		setTitle("M\u00F3dulo Funcionario - Consultar/Atualizar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 511, 298);
		contentPane.add(panel);
			
		
		JLabel lblId = new JLabel("Identificador:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(10, 38, 115, 14);
		panel.add(lblId);
		
		txtId = new JTextField();
		txtId.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent evt) {
				funcionarioVO.setIdFuncionario(Integer.parseInt(txtId.getText()));
			}
		});
		txtId.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtId.setBounds(135, 35, 326, 20);
		panel.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				funcionarioVO.setNome(txtNome.getText());
			}
		});
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(10, 70, 115, 14);
		panel.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpf.setBounds(10, 104, 115, 14);
		panel.add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTelefone.setBounds(10, 134, 115, 14);
		panel.add(lblTelefone);
		
		JLabel lblEmail = new JLabel("email:");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(10, 168, 115, 14);
		panel.add(lblEmail);
		txtNome.setText("");
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNome.setEnabled(true);
		txtNome.setEditable(true);
		txtNome.setColumns(20);
		txtNome.setBounds(135, 66, 326, 20);
		panel.add(txtNome);
		
		txtCPF = new JTextField();
		txtCPF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				funcionarioVO.setCpf(txtCPF.getText());
			}
		});
		txtCPF.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		txtCPF.setText("");
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCPF.setColumns(10);
		txtCPF.setBounds(135, 100, 326, 20);
		panel.add(txtCPF);
		
		txtTelefone = new JTextField();
		txtTelefone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				funcionarioVO.setTelefone(txtTelefone.getText());
			}
		});
		txtTelefone.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		txtTelefone.setText("");
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(135, 134, 326, 20);
		panel.add(txtTelefone);
		
		txtEmail = new JTextField();
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				funcionarioVO.setEmail(txtEmail.getText());
			}
		});
		txtEmail.setText("");
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setColumns(10);
		txtEmail.setBounds(135, 168, 326, 20);
		panel.add(txtEmail);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAtualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				funcionarioDAO.atualizar(funcionarioVO);
				JOptionPane.showMessageDialog(null,"Funcionario atualizado com sucesso!");
							
			}
		});
		btnAtualizar.setForeground(new Color(220, 20, 60));
		btnAtualizar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAtualizar.setBounds(281, 211, 180, 40);
		panel.add(btnAtualizar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				FuncionarioVO funcionario = funcionarioDAO.consultarFuncionarioPorId(funcionarioVO.getIdFuncionario());
				txtNome.setText(funcionario.getNome());
				txtCPF.setText(funcionario.getCpf());
				txtTelefone.setText(funcionario.getTelefone());
				txtEmail.setText(funcionario.getEmail());
			}
		});
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnConsultar.setBounds(10, 211, 172, 40);
		panel.add(btnConsultar);
		
		
	}
}
