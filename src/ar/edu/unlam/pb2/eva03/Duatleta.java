package ar.edu.unlam.pb2.eva03;

public class Duatleta extends Deportista implements ICorredor, INadador{
	
	private Integer distanciaPreferida;
	public Duatleta(Integer numeroDeSocio, String nombre, String distaciaPreferida) {
		super(numeroDeSocio, nombre);
		this.setDistanciaPreferida(distanciaPreferida);
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
	public Integer getDistanciaPreferida() {
		return distanciaPreferida;
	}
	public void setDistanciaPreferida(Integer distanciaPreferida) {
		this.distanciaPreferida = distanciaPreferida;
	}

}
