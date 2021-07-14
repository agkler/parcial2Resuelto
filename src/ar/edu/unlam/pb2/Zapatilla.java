package ar.edu.unlam.pb2;

public class Zapatilla extends Producto implements Indumentaria {

	private String color;
	private String talle;

	public Zapatilla(Integer codigo, String descripcion, String talle, String marca, String color, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.talle=talle;
		this.color=color;
	}

	@Override
	public String getTalle() {
		// TODO Auto-generated method stub
		return this.talle;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

}
