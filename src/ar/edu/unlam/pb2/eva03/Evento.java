package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipoDeEvento) {
		this.setTipo(tipoDeEvento);
		this.participantes = new HashMap<>();
		this.numeroDeInscripcion=1;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public void agregarDeportistaAEvento(Deportista deportista) {
		this.participantes.put(numeroDeInscripcion, deportista);
		this.numeroDeInscripcion++;
	}
	
}
