package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Supermercado {

	String nombre; // Nombre del supermercado
	private Set<Producto> productosExistentes; // Listado de productos que se comercializan
	private List<Producto> productosDisponibles; // Detalle de cada producto ingresado
	private Map<Integer, Venta> ventasRealizadas; // Listado de ventas realizadas (identificadas por el n?mero de venta)
	Integer contadorDeVentas = 0; // Identificador del n?mero de venta

	public Supermercado(String nombre) {
		this.nombre = nombre;
		productosExistentes = new HashSet<Producto>();
		productosDisponibles = new ArrayList<Producto>();
		ventasRealizadas = new HashMap<Integer, Venta>();
	}

	public void ingresarProducto(Producto nuevo) {
		productosExistentes.add(nuevo);
		productosDisponibles.add(nuevo);
	}

	public Set<Producto> getOfertaDeProductos() {
		// Devuelve el conjunto de productos que se comercializan
		return productosExistentes;

	}

	public Integer getStock(Integer codigo) {
		// Devuelve la cantidad de unidades de un producto determinado
		Integer stockProductos = 0;
		for (Producto producto : productosDisponibles) {
			if (producto.getCodigo().equals(codigo))
				stockProductos++;
		}
		return stockProductos;

	}

	public Boolean productoExiste(Integer codigoDeProducto) throws ProductoInexistente {
		for (Producto producto : productosExistentes) {
			if (producto.codigo.equals(codigoDeProducto)) {
				return true;
			}
		}
		throw new ProductoInexistente();
	}

	public Producto getProductoPorCodigo(Integer codigoDeProducto) throws ProductoSinStock {
		// Busca la disponibilidad de un producto
		for (Producto producto : productosDisponibles) {
			if (producto.codigo.equals(codigoDeProducto)) {
				return producto;
			}
		}
		throw new ProductoSinStock();
	}

	public Integer registrarNuevaVenta(Integer dniDelComprador, String nombreDelComprador) {
		// Registra una nueva venta
		ventasRealizadas.put(++contadorDeVentas, new Venta(dniDelComprador, nombreDelComprador));
		return contadorDeVentas;
	}

	public Venta getVenta(Integer numeroDeVenta) {
		// Devuelve una venta en funci?n de su n?mero identificatorio
		return ventasRealizadas.get(numeroDeVenta);
	}

	public void agregarAlCarrito(Integer numeroDeVenta, Integer codigoDeProducto)
			throws ProductoSinStock, ProductoInexistente {
		// Incorpora al carrito de compras de la venta identificada por el
		// "numeroDeVenta", el producto identificado por el "codigoDeProducto"
		Venta nuevaVenta = getVenta(numeroDeVenta);
		
		if (productoExiste(codigoDeProducto)) {
			nuevaVenta.agregarAlCarritoDeCompras(getProductoPorCodigo(codigoDeProducto));
			productosDisponibles.remove(getProductoPorCodigo(codigoDeProducto));
		}
	}

	public Integer getCantidadProductosComestibles() {
		// TODO Auto-generated method stub
		Integer stockProductosComestibles = 0;
		for (Producto producto : productosDisponibles) {
			if (producto instanceof Comestible)
				stockProductosComestibles++;
		}
		return stockProductosComestibles;

	}
	

}
