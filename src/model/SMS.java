package model;

import java.time.LocalDateTime;


public class SMS {
	private String destino;
	private String origem;
	private String texto;
	private LocalDateTime timestamp;
	
	public SMS(String origem, String destino, String texto) {
		this.origem = origem;
		this.destino = destino;
		this.texto = texto;
		this.timestamp = LocalDateTime.now();
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
