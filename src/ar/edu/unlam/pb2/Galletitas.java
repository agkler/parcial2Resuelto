package ar.edu.unlam.pb2;


public class Galletitas extends Producto implements Comestible {

	private String fechaElab;
	private String fechaVenc;

	public Galletitas(Integer codigo, String descripcion, String fechaElab, String fechaVenc, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.fechaElab=fechaElab;
		this.fechaVenc=fechaVenc;
		
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

}
