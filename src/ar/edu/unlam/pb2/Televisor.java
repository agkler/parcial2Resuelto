package ar.edu.unlam.pb2;

public class Televisor extends Producto implements Electrodomestico {

	private Integer pulgadas;
	private Integer garantia;

	public Televisor(Integer codigo, String descripcion, Integer pulgadas, Integer garantia, String marca, Double precio) {
		super(codigo, descripcion, marca, precio);
		this.pulgadas=pulgadas;
		this.garantia=garantia;
	}

	public Integer getPulgadas() {
		// TODO Auto-generated method stub
		return this.pulgadas;
	}

	@Override
	public Integer getGarantia() {
		// TODO Auto-generated method stub
		return this.garantia;
	}

}
