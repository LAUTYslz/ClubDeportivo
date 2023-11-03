package ar.edu.unlam.pb2.eva03;

public class Ciclista extends Deportista implements ICiclista{

	private String tipoDeBicicleta;
//	private TipoDeBicicleta tipoDeBicicleta;
	
	public Ciclista(Integer numeroDeSocio, String nombre, String tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.setTipoDeBicicleta(tipoDeBicicleta);
	}

	public String getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(String tipoDeBiciletaOriginal) {
//		TipoDeBicicleta tipo = TipoDeBicicleta.valueOf(tipoDeBiciletaOriginal.toUpperCase());
		this.tipoDeBicicleta = tipoDeBiciletaOriginal;
	}

}
