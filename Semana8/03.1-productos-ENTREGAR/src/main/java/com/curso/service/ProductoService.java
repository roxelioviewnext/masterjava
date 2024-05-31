package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductoService {
	
	List<Producto> getProductos();
	
	void updateProducto(Producto producto);
	
	double getPrecioProducto(int id);

	void insertProducto(Producto producto);
	
}
