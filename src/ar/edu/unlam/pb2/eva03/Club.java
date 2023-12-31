package ar.edu.unlam.pb2.eva03;

import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

import java.util.HashMap;
import java.util.HashSet;

public class Club {

	private String nombreDelClub;
	private String nombre;
	private Set<Deportista> socios;
	private Map<String, Evento> competencias;

	public Club(String nombreDelClub) {
		this.setNombre(nombreDelClub);
		this.socios = new HashSet<>();
		this.competencias = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
	}

	public Object getCantidadSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipoDeEvento, String nombreDeEvento) {
		Evento evento = new Evento(tipoDeEvento);
		this.competencias.put(nombreDeEvento, evento);
	}

	public Boolean inscribirEnEvento(String nombreDeEvento, Deportista deportista) throws NoEstaPreparado {
		Evento evento = this.competencias.get(nombreDeEvento);
		Boolean esSocio = this.socios.contains(deportista);
		if (!esSocio) {
			return null;
		}
		switch (evento.getTipo()) {
		case CARRERA_5K: {
			if (deportista instanceof ICorredor) {
//				Integer cantidadDeKmEntrenados=corredor.getCantidadDeKilometrosEntrenados();
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case CARRERA_10K: {
			if(deportista instanceof ICorredor) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case CARRERA_21K: {
			if(deportista instanceof ICorredor) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case CARRERA_42K: {
			if(deportista instanceof ICorredor) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case DUATLON: {
			if(deportista instanceof ICorredor) {
				if(deportista instanceof INadador) {
//				Duatleta corredor = (Duatleta) deportista;	
				evento.agregarDeportistaAEvento(deportista);
				return true;
				}
			}
			throw new NoEstaPreparado();
		}
		case CARRERA_NATACION_EN_PICINA: {
			if(deportista instanceof INadador) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();

		}
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS: {
			if(deportista instanceof INadador) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case TRIATLON_SHORT: {
			if(deportista instanceof Triatleta) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case TRIATLON_OLIMPICO: {
			if(deportista instanceof Triatleta) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case TRIATLON_MEDIO: {
			if(deportista instanceof Triatleta) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
			}
			throw new NoEstaPreparado();
		}
		case TRIATLON_IRONMAN: {
			if(deportista instanceof Triatleta) {
//				if(deportista instanceof ICiclista) {
//					if(deportista instanceof ICorredor) {
				evento.agregarDeportistaAEvento(deportista);
				return true;
//					}
//				}
			}
			throw new NoEstaPreparado();
		}
	}
		return null;

	}
	
}


		
