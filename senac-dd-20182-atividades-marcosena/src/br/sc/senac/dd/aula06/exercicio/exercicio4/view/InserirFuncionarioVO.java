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
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InserirFuncionarioVO extends JFrame {
	
	FuncionarioVO funcionarioVO = new FuncionarioVO();
	FuncionarioDAO funcionarioDAO = new FuncionarioDAO();

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InserirFuncionarioVO frame = new InserirFuncionarioVO();
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
	public InserirFuncionarioVO() {
		setTitle("M\u00F3dulo Funcion\u00E1rio - Cadastrar");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNome = new JButton("Nome:");
		btnNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNome.setBounds(10, 61, 115, 23);
		contentPane.add(btnNome);
		
		txtNome = new JTextField();
		txtNome.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				funcionarioVO.setNome(txtNome.getText());
				
			}
		});
		txtNome.setEnabled(true);
		txtNome.setEditable(true);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNome.setText("");
		txtNome.setBounds(135, 61, 326, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnCpf = new JButton("CPF:");
		btnCpf.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		btnCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCpf.setBounds(10, 95, 115, 23);
		contentPane.add(btnCpf);
		
		txtCPF = new JTextField();
		txtCPF.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		txtCPF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				funcionarioVO.setCpf(txtCPF.getText());
				
			}
		});
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCPF.setText("");
		txtCPF.setColumns(10);
		txtCPF.setBounds(135, 95, 326, 20);
		contentPane.add(txtCPF);
		
		JButton btnTelefone = new JButton("Telefone:");
		btnTelefone.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		btnTelefone.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTelefone.setBounds(10, 129, 115, 23);
		contentPane.add(btnTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setToolTipText("Digite s\u00F3 n\u00FAmeros!");
		txtTelefone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				funcionarioVO.setTelefone(txtTelefone.getText());
				
			}
		});
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefone.setText("");
		txtTelefone.setColumns(10);
		txtTelefone.setBounds(135, 129, 326, 20);
		contentPane.add(txtTelefone);
		
		JButton btnEmail = new JButton("Email:");
		btnEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEmail.setBounds(10, 163, 115, 23);
		contentPane.add(btnEmail);
		
		txtEmail = new JTextField();
		txtEmail.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				
				funcionarioVO.setEmail(txtEmail.getText());
			}
		});
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setText("");
		txtEmail.setColumns(10);
		txtEmail.setBounds(135, 163, 326, 20);
		contentPane.add(txtEmail);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int novoId = funcionarioDAO.inserir(funcionarioVO);
				
				if(novoId > 0) {
					
					JOptionPane.showMessageDialog(null,"Funcionario cadastrado com sucesso. Identificador: " +novoId);	
				}				
				
			}
		});
		btnCadastrar.setForeground(new Color(220, 20, 60));
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCadastrar.setBounds(123, 211, 282, 40);
		contentPane.add(btnCadastrar);
	}
}
