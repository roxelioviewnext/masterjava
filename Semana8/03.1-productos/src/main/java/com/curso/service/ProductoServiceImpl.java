package com.curso.service;

import java.util.List;
import java.util.Optional;

import org.antlr.v4.runtime.atn.SemanticContext.Empty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductoDao;
import com.curso.model.Producto;

import jakarta.transaction.Transactional;

@Service 
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoDao productoDao;

	@Override
	public List<Producto> getProductos() {
		return productoDao.findAll();
	}

	@Override
	@Transactional
	public void updateProducto(Producto producto) {
		productoDao.findAll().stream().filter(p -> p.getIdProducto() == producto.getIdProducto()).forEach(p -> {
			p.setNombre(producto.getNombre());
			p.setPrecio(producto.getPrecio());
			p.setStock(producto.getStock());
		});

	}

	@Override
	public double getPrecioProducto(int id) {
		double num = -1;
		
		Optional<Producto> optional = productoDao.findAll().stream().filter(p -> p.getIdProducto() == id).findFirst();
		if (optional.isPresent()) {
			num = optional.get().getPrecio();
		}
		
		return num;
	}

	@Override
	public void insertProducto(Producto producto) {
		Optional<Producto> productoOptional = productoDao.findById(producto.getIdProducto());
		if(!productoOptional.isPresent()) {
			productoDao.save(producto);
		}
		
	}

}