package ar.edu.unlam.pb2.eva03;

public class Triatleta extends Deportista implements INadador, ICorredor, ICiclista{

	private String distanciaPreferida;
	private TipoDeBicicleta tipoDeBicicleta;
	
	public Triatleta(int numeroDeSocio, String nombre, String distaciaPreferida, TipoDeBicicleta tipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.setDistanciaPreferida(distaciaPreferida);
		this.setTipoDeBicicleta(tipoDeBicicleta);
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getDistanciaPreferida() {
		return distanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return tipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		this.tipoDeBicicleta = tipoDeBicicleta;
	}

}
