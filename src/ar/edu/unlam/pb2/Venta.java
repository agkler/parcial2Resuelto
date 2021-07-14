package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Venta {

	private Integer dniDelComprador;
	private String nombreDelComprador;
	private ArrayList<Producto> carritoDeCompras;
	private Double importe = 0.0;

	public Venta(Integer dniDelComprador, String nombreDelComprador) {
		this.dniDelComprador = dniDelComprador;
		this.nombreDelComprador = nombreDelComprador;
		carritoDeCompras = new ArrayList<Producto>();
	}

	public Integer getDniDelComprador() {
		return dniDelComprador;
	}

	public String getNombreDelComprador() {
		return nombreDelComprador;
	}

	public void agregarAlCarritoDeCompras(Producto nuevoProducto) {
		carritoDeCompras.add(nuevoProducto);
		importe += nuevoProducto.getPrecio();

	}

	public Double getImporte() {
		// TODO Auto-generated method stub
		return this.importe;
	}

}
