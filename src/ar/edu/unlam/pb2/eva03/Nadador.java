package ar.edu.unlam.pb2.eva03;

public class Nadador extends Deportista implements INadador{

	private String estiloPreferido;


	public Nadador(Integer numeroDeSocio, String nombre, String estilo) {
		super(numeroDeSocio, nombre);
		this.setEstiloPreferido(estilo);
	}

	public void setEstiloPreferido(String estiloPreferido) {
		this.estiloPreferido = estiloPreferido;
	}

	public String getEstiloPreferido() {
		return estiloPreferido;
	}

}
