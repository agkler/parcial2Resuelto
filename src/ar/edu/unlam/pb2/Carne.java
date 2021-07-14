package ar.edu.unlam.pb2;

public class Carne extends Producto implements Comestible {

	private String fechaElab;
	private String fechaVenc;
	private Double peso;

	public Carne(Integer codigo, String descripcion, String fechaElab, String fechaVenc, Double peso, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaElab=fechaElab;
		this.fechaVenc=fechaVenc;
		this.peso=peso;
	}

	@Override
	public String getFechaDeElaboracion() {
		// TODO Auto-generated method stub
		return this.fechaElab;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaVenc;
	}

	public Double getKilos() {
		// TODO Auto-generated method stub
		return this.peso;
	}

}
