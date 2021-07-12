package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Movimento {

	private String codigo;
	private String placa;
	private String modelo;
	private String dataEntrada;
	private String horaEntrada;
	private String dataSaida;
	private String horaSaida;
	private String tempoTotal;
	private String valorTotal;
	
	
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}


	public String getTempoTotal() {
		return tempoTotal;
	}

	public void setTempoTotal(String tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	
	public String getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public String toString() {
		return codigo + ";" + placa + ";" + modelo + ";"
				+ dataEntrada + ";" + horaEntrada + ";" 
				+ "0;" + "0;" +"0;" + "0";
	}
	
	
	
	public static String converterDate(LocalDate data) {
		String dataConversao = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
		return dataConversao;
	}
	
	public static String converterLocal(LocalTime hora) {
		String dataConversao = hora.format(DateTimeFormatter.ofPattern("HH:mm"));
		return dataConversao;
	}
	
}

