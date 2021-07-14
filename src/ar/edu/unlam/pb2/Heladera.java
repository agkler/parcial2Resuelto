package ar.edu.unlam.pb2;

public class Heladera extends Producto implements Electrodomestico {

	private Boolean esNoFrost;
	private Integer garantia;

	public Heladera(Integer codigo, String descripcion, Boolean esNoFrost, Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.esNoFrost=esNoFrost;
		this.garantia=garantia;
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

	public Boolean isNoFrost() {
		// TODO Auto-generated method stub
		return this.esNoFrost;
	}

}
