package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import cadastrar.AppEstacionamento;
import dao.MovimentoDao;
import model.Movimento;
import util.Util;

public class FrameEstacionamento {
	
	private JLabel labelEntrada;
	private JLabel labelPlacaEntrada;
	private JTextField textPlacaEntrada;
	private JLabel labelModeloEntrada;
	private JTextField textModeloEntrada;
	private JButton buttonEntrar;
	private JLabel labelSaida;
	private JLabel labelBuscarPlaca;
	private JTextField textBuscarPlaca;
	private JButton buttonBuscar;
	private JLabel labelModeloSaida;
	private JTextField textModeloSaida;
	private JLabel labelDataEntrada;
	private JTextField textDataEntrada;
	private JLabel labelHoraEntrada;
	private JTextField textHoraEntrada;
	private JLabel labelDataSaida;
	private JTextField textDataSaida;
	private JLabel labelHoraSaida;
	private JTextField textHoraSaida;
	private JLabel labelTempo;
	private JTextField textTempo;
	private JLabel labelValorTotal;
	private JTextField textValorTotal;
	private JButton buttonSaida;
	private JButton buttonFecharSistema;
	
	private JScrollPane scrollTable;
	private JTable tabelaVeiculos;
	private DefaultTableModel tabelaVeiculoModelo;
	
	
	
	
	public void criarTela() {
		
		Font fonte = new Font("SansSerif", Font.BOLD, 18);	
		Font fonte2 = new Font("SansSerif", Font.ITALIC, 25);
		
		
		JFrame tela = new JFrame();
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Cadastro - Estaciona Bem");
		tela.setSize(665, 700);
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		
		labelEntrada = new JLabel("ENTRADA");
		labelEntrada.setBounds(30, 20, 100, 30);
		labelEntrada.setForeground(new Color(27, 179, 4));
		labelEntrada.setFont(fonte);
		
		
		labelPlacaEntrada = new JLabel("PLACA: ");
		labelPlacaEntrada.setBounds(30, 60, 60, 30);
		
		textPlacaEntrada = new JTextField();
		textPlacaEntrada.setBounds(30, 90, 210, 30);
		
		
		labelModeloEntrada = new JLabel("MODELO:");
		labelModeloEntrada.setBounds(255, 60, 60, 30);
		
		textModeloEntrada = new JTextField();
		textModeloEntrada.setBounds(255, 90, 210, 30);
		
		
		buttonEntrar = new JButton("ENTRAR");
		buttonEntrar.setBounds(500, 90, 120, 30);
//		buttonEntrar.setBackground(Color.blue);
		
		
		criarTabela();
		
		
		labelSaida = new JLabel("SAÍDA");
		labelSaida.setBounds(30, 310, 80, 30);
		labelSaida.setForeground(new Color(27, 179, 4));
		labelSaida.setFont(fonte);
		
	    labelBuscarPlaca = new JLabel("PLACA: ");
		labelBuscarPlaca.setBounds(30, 350, 60, 30);
		
		textBuscarPlaca = new JTextField();
		textBuscarPlaca.setBounds(30, 380, 210, 30);
		
		
		buttonBuscar = new JButton("BUSCAR");
		buttonBuscar.setBounds(275, 380, 120, 30);

		
		
		labelModeloSaida = new JLabel("MODELO:");
		labelModeloSaida.setBounds(30, 430, 60, 30);
		
		textModeloSaida = new JTextField();
		textModeloSaida.setBounds(30, 460, 80, 30);
		
		
		labelDataEntrada = new JLabel("DATA ENTRADA:");
		labelDataEntrada.setBounds(120, 430, 100, 30);
		
		textDataEntrada = new JTextField();
		textDataEntrada.setBounds(120, 460, 100, 30);
		
		labelHoraEntrada = new JLabel("HORA ENTRADA:");
		labelHoraEntrada.setBounds(230, 430, 100, 30);
		
		textHoraEntrada = new JTextField();
		textHoraEntrada.setBounds(230, 460, 100, 30);
		
		
		
		labelDataSaida = new JLabel("DATA SAÍDA:");
		labelDataSaida.setBounds(340, 430, 100, 30);
		
		textDataSaida = new JTextField();
		textDataSaida.setBounds(340, 460, 100, 30);
		
		labelHoraSaida = new JLabel("HORA SAÍDA:");
		labelHoraSaida.setBounds(450, 430, 100, 30);
		
		textHoraSaida = new JTextField();
		textHoraSaida.setBounds(450, 460, 100, 30);
		
		
		labelTempo = new JLabel("TEMPO:");
		labelTempo.setBounds(560, 430, 80, 30);
		
		textTempo = new JTextField();
		textTempo.setBounds(560, 460, 55, 30);
		
		
		labelValorTotal = new JLabel("VALOR A PAGAR:");
		labelValorTotal.setBounds(30, 540, 100, 30);
				
		
		textValorTotal = new JTextField();
		textValorTotal.setBounds(160, 540, 90, 40);
		textValorTotal.setFont(fonte2);
		
		
		buttonSaida = new JButton("EFETUAR SAÍDA");
		buttonSaida.setBounds(295, 540, 150, 40);
//		buttonSaida.setBackground(Color.blue);
		
		buttonFecharSistema = new JButton("FECHAR SISTEMA");
		buttonFecharSistema.setBounds(465, 540, 150, 40);
		
		
		
		
		tela.getContentPane().add(labelEntrada);
		tela.getContentPane().add(labelPlacaEntrada);
		tela.getContentPane().add(textPlacaEntrada);
		tela.getContentPane().add(labelModeloEntrada);
		tela.getContentPane().add(textModeloEntrada);
		tela.getContentPane().add(buttonEntrar);
		tela.getContentPane().add(labelSaida);
		tela.getContentPane().add(labelBuscarPlaca);
		tela.getContentPane().add(textBuscarPlaca);
		tela.getContentPane().add(buttonBuscar);
		tela.getContentPane().add(labelModeloSaida);
		tela.getContentPane().add(textModeloSaida);
		tela.getContentPane().add(labelDataEntrada);
		tela.getContentPane().add(textDataEntrada);
		tela.getContentPane().add(labelHoraEntrada);
		tela.getContentPane().add(textHoraEntrada);
		tela.getContentPane().add(labelDataSaida);
		tela.getContentPane().add(textDataSaida);
		tela.getContentPane().add(labelHoraSaida);
		tela.getContentPane().add(textHoraSaida);
		tela.getContentPane().add(labelTempo);
		tela.getContentPane().add(textTempo);
		tela.getContentPane().add(labelValorTotal);
		tela.getContentPane().add(textValorTotal);
		tela.getContentPane().add(buttonSaida);
		tela.getContentPane().add(buttonFecharSistema);
		
		tela.getContentPane().add(scrollTable);
				
		
		tela.setVisible(true);	
		
		//ouvinte de ação/evento para o botão gravar as infos do veículo
		buttonEntrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (validarFormulario()) {
					
					Movimento movimento = new Movimento();
					movimento.setCodigo(Util.gerarCodigo());
					movimento.setPlaca(textPlacaEntrada.getText().trim().toUpperCase());
					movimento.setModelo(textModeloEntrada.getText().trim().toUpperCase());
					movimento.setDataEntrada(Movimento.converterDate(LocalDate.now()));
					movimento.setHoraEntrada(Movimento.converterLocal(LocalTime.now()));
					movimento.setDataSaida(Movimento.converterDate(LocalDate.now()));
					movimento.setHoraSaida(Movimento.converterLocal(LocalTime.now()));
					movimento.setTempoTotal(textTempo.getText().trim().toUpperCase());
					movimento.setValorTotal(textValorTotal.getText().trim().toUpperCase());
					
				
				MovimentoDao dao = new MovimentoDao(movimento);
				dao.salvar();
				
				JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso");
				
				limparFormulario();
				criarTabela();
				
				}else {
					JOptionPane.showMessageDialog(
							null, 
							"Preencha todos os campos para prosseguir", 
							"Atenção", 
							JOptionPane.WARNING_MESSAGE);
					
				}
				
			}
		});
		
	
		
		
	buttonBuscar.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			String placa;
			int buscar = tabelaVeiculos.getSelectedRow();
			
//			
			placa = tabelaVeiculos.getModel().getValueAt(buscar, 0).toString();
			
			MovimentoDao dao = new MovimentoDao();
			Movimento movimento = dao.buscarMovimento(placa);
			
			textModeloSaida.setText(movimento.getModelo());
			textDataEntrada.setText(movimento.getDataEntrada());
			textHoraEntrada.setText(movimento.getHoraEntrada());
			textDataSaida.setText(Movimento.converterDate(LocalDate.now()));
			textHoraSaida.setText(Movimento.converterLocal(LocalTime.now()));
			textTempo.setText(movimento.getTempoTotal());
			textValorTotal.setText(movimento.getValorTotal());
			
		
		}
	});
	

		} // fim do método criar tela
	
	
	
	public void criarTabela() {
		
		//Modelo
		tabelaVeiculoModelo = new DefaultTableModel();
		
		tabelaVeiculoModelo.addColumn("CÓDIGO");
		tabelaVeiculoModelo.addColumn("PLACA");
		tabelaVeiculoModelo.addColumn("MODELO");
		tabelaVeiculoModelo.addColumn("DATA ENTRADA");
		
		
//		vetor que representa cada linha da tabela//
		MovimentoDao movimentoDao = new MovimentoDao();
		ArrayList<Movimento> movimentos = movimentoDao.listarMovimentos();
		
		for (Movimento movimento : movimentos) {
			
			String[] vetorVeiculo = {movimento.getCodigo(), movimento.getPlaca(), movimento.getModelo(), movimento.getDataEntrada()};
			tabelaVeiculoModelo.addRow(vetorVeiculo);
		}
		
		
		//Tabela
		tabelaVeiculos = new JTable(tabelaVeiculoModelo);
		
		tabelaVeiculos.getColumnModel().getColumn(0).setPreferredWidth(80);
		tabelaVeiculos.getColumnModel().getColumn(1).setPreferredWidth(80);
		tabelaVeiculos.getColumnModel().getColumn(2).setPreferredWidth(80);
		tabelaVeiculos.getColumnModel().getColumn(3).setPreferredWidth(80);
		
		
		scrollTable = new JScrollPane(tabelaVeiculos);
		scrollTable.setBounds(30, 150, 590, 130);
		
	}
	
	
	private void limparFormulario() {
		textPlacaEntrada.setText("");
		textModeloEntrada.setText("");
		
		textBuscarPlaca.setText("");
		textModeloSaida.setText("");
		textDataEntrada.setText("");
		textHoraEntrada.setText("");
		textDataSaida.setText("");
		textHoraSaida.setText("");
		textTempo.setText("");
		textValorTotal.setText("");
	}

	
	private boolean validarFormulario() {
		boolean valido = true;
		
		if (textPlacaEntrada.getText().trim().length() == 0) {
			labelPlacaEntrada.setForeground(Color.red);
			valido = false;
		} else if (textModeloEntrada.getText().trim().length() == 0) {
			labelModeloEntrada.setForeground(Color.red);
			valido = false;
		} 
			
		
		return valido;		
	}

	
} //fim da classe
