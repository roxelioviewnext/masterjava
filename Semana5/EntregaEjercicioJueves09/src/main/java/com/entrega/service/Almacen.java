package com.entrega.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.entrega.model.Producto;
import com.entrega.model.Seccion;

public class Almacen {
	

	public static List<Producto> productos = new ArrayList<Producto>(List.of(
			new Producto(Seccion.CARPINTERIA, "Clavo", 300, 100),
			new Producto(Seccion.LIMPIEZA, "Frega suelos", 20, 19), new Producto(Seccion.JARDINERIA, "Pala", 220, 10),
			new Producto(Seccion.JARDINERIA, "Planta", 2, 30), new Producto(Seccion.INFORMATICA, "Ordenador", 120, 3),
			new Producto(Seccion.CARPINTERIA, "Martillo", 600, 30)));
	
	/*
	 * Obtiene una lista de productos que tiene esa seccion
	 */
	public static List<Producto> filtrarSeccion(String seccion) {
		List<Producto> temp = productos.stream().filter(p -> p.getSeccionString().equals(seccion)).toList();
		return temp.isEmpty() ? productos : temp;
	}
	
	public static List<Producto> productosFiltrados = filtrarSeccion("vvvv");
	
	

	/*
	 * Si el producto no esta en la lista, lo añade
	 */
	public static void agregarProducto(Producto producto) {
		if (!productos.contains(producto)) {
			productos.add(producto);
		}
	}


	/*
	 * Obtiene un producto con ese id
	 */
	public static Producto getProducto(int id) {
		return productos.stream().filter(p -> p.getId() == id).findFirst().get();
	}

	/*
	 * Si el producto esta en la lista, lo elimina
	 */
	public static void eliminarProducto(Producto producto) {
		if (productos.contains(producto)) {
			productos.remove(producto);
		}
	}

	public List<Producto> listarProductos() {
		return productos;
	}

	public List<Producto> listaProductosBySeccion(String seccion) {
		List<Producto> lista = new ArrayList<>();
		for (Producto producto : productos) {
			if (producto.getSeccion().name().equalsIgnoreCase(seccion)) {
				lista.add(producto);
			}
		}

		return lista;
	}

	/*
	 * Modifica el producto con el mismo id que quieres insertar
	 */
	public static void editarProducto(Producto productoEditado) {
		for (Producto producto : productos) {
			if (producto.equals(productoEditado)) {
				producto.setNombre(productoEditado.getNombre());
				producto.setPrecio(productoEditado.getPrecio());
				producto.setSeccion(productoEditado.getSeccion());
				producto.setStock(productoEditado.getStock());
				break;
			}
		}
	}
}
