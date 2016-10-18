package InterfaceDeMenu;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Entidades.Pedido;
import Entidades.Produto;
import Repositorios.RepositorioEstoqueProduto;
import Servicos.ServicoFachada;
import Servicos.ServicoProduto;

public class InterfaceDeMenuGeral {
	static ServicoFachada servico = new ServicoFachada();
	static ServicoFachada servico2 = new ServicoFachada();
	
	

	public static void interfaceInicial() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton botaoCadastrarProduto = new JButton("Cadastrar Produto");
		JButton botaoCadastrarPedido = new JButton("Cadastrar Pedido");
		JLabel titulo = new JLabel("GEstoque");
		titulo.setHorizontalAlignment(0);

		// panel.setLayout(new GridLayout(3, 1));
		panel.add(titulo);

		// botaoCadastrarPedido.setPreferredSize(new Dimension(100, 100));
		panel.add(botaoCadastrarProduto);
		panel.add(botaoCadastrarPedido);
		frame.setBounds(50, 100, 800, 500);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrarProduto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				interfaceCadastroProduto();
			}
		});

		botaoCadastrarPedido.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				interfaceCadastroPedido();
			}
		});
	}

	private static void interfaceCadastroProduto() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel labelCodigo = new JLabel("Codigo");
		JLabel labelTipo = new JLabel("Tipo do produto");
		final JTextField idDoProduto = new JTextField();
		final JTextField nomeDoProduto = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");

		labelCodigo.setHorizontalAlignment(0);
		panel.add(labelCodigo);
		idDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(idDoProduto);

		labelTipo.setHorizontalAlignment(0);
		panel.add(labelTipo);
		nomeDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(nomeDoProduto);

		panel.add(botaoCadastrar);
		frame.setBounds(50, 100, 800, 500);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
				Produto produto = servico.cadastrarProduto(idDoProduto.getText(),nomeDoProduto.getText());
				
				System.out.println("Codigo: " + produto.getCodigo());
				System.out.println("Tipo do produto: "
						+ produto.getNome());
			}
		});
	}

	private static void interfaceCadastroPedido() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel labelId = new JLabel("Id do cadastro");
		JLabel labelNome = new JLabel("Nome do produto");
		final JTextField idDoProduto = new JTextField();
		final JTextField nomeDoProduto = new JTextField();
		JButton botaoCadastrar = new JButton("Cadastrar");

		labelId.setHorizontalAlignment(0);
		panel.add(labelId);
		idDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(idDoProduto);

		labelNome.setHorizontalAlignment(0);
		panel.add(labelNome);
		nomeDoProduto.setPreferredSize(new Dimension(100, 20));
		panel.add(nomeDoProduto);

		panel.add(botaoCadastrar);
		frame.setBounds(50, 100, 800, 500);
		frame.getContentPane().add(panel);
		frame.setVisible(true);

		botaoCadastrar.addActionListener(new ActionListener() {

			private Produto produtox;

			public void actionPerformed(ActionEvent e) {
				
				Pedido pedido = servico2.cadastrarPedido(idDoProduto.getText(), produtox ,2);//Passar conforme parte Grafica
				
				System.out.println("codigo: " + pedido.getCodigo());
				System.out.println("produto: " + nomeDoProduto.getText());
			
				//System.out.println("quantidade: " + quantidade.getText());
				
			}
		});
	}

}