package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.Movimento;

public class MovimentoDao {
	
	
	
	private Movimento movimento;
	private static final String LOCAL_ARQUIVO = "C:/Users/saras/FPOO/movimentacao.ds1";
	
	
	
	public MovimentoDao(Movimento movimento) {          
		this.movimento = movimento;
	}
	
	public MovimentoDao() {
		
	}
	
	public Movimento getVeiculo() {
		return movimento;
	}

	
	//para adicionar mais uma linha e salvar
	public void salvar(){
		Path path = Paths.get(LOCAL_ARQUIVO);
		
		
		try{
			BufferedWriter writer = Files.newBufferedWriter(path, Charset.forName("UTF-8"), 
					StandardOpenOption.WRITE,
					StandardOpenOption.APPEND);
			
			writer.write(movimento.toString());
			writer.newLine();
			writer.close();
			
			
		}catch (Exception e){
			System.out.println("Desculpe! Não foi possível gravar os dados.");
		}
		
	}	
		
	//matriz ou array
	public ArrayList<Movimento> listarMovimentos() {
		Path path = Paths.get(LOCAL_ARQUIVO);
		
		
		try {
			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
			
			String linha = reader.readLine();
			ArrayList<Movimento> movimentos = new ArrayList<>();
			
			
		while (linha != null) {
			
			String[] vetorMovimento = linha.split(";");
			
						
			Movimento movimento = new Movimento();
			movimento.setCodigo(vetorMovimento[0]);
			movimento.setPlaca(vetorMovimento[1]);
			movimento.setModelo(vetorMovimento[2]);
			movimento.setDataEntrada(vetorMovimento[3]);
			movimento.setHoraEntrada(vetorMovimento[4]);
			movimento.setDataSaida(vetorMovimento[5]);
			movimento.setHoraSaida(vetorMovimento[6]);
			movimento.setTempoTotal(vetorMovimento[7]);
			movimento.setValorTotal(vetorMovimento[8]);
			
			movimentos.add(movimento);
			linha = reader.readLine();
			}
		
		reader.close();
		
		return movimentos;
		
			
		} catch(Exception e){
			System.out.println("Ocorreu um erro!");
			return null;
			}
		
	}// fim método array
	
	
	public Movimento buscarMovimento (String placa) {
		Path path = Paths.get(LOCAL_ARQUIVO);
		
		try {
			BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"));
			String linha = reader.readLine();
			Movimento veiculo = new Movimento();
		
			
			while (linha != null) {
				String[] vetorMovimento = linha.split(";");
				

				if (vetorMovimento[1].equals(placa)) {
					veiculo.setCodigo(vetorMovimento[0]);
					veiculo.setPlaca(vetorMovimento[1]);
					veiculo.setModelo(vetorMovimento[2]);			
					veiculo.setDataEntrada(vetorMovimento[3]);
					veiculo.setHoraEntrada(vetorMovimento[4]);
					veiculo.setDataSaida(vetorMovimento[5]);
					veiculo.setHoraSaida(vetorMovimento[6]);
					veiculo.setTempoTotal(vetorMovimento[7]);
					veiculo.setValorTotal(vetorMovimento[8]);
					
					break;
				}
				linha = reader.readLine();
			}
			
			reader.close();
			return veiculo;
		
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na tentativa de ler o arquivo");
			return null;
		}
		
	}

} //final da classe