package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductoService;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping(value = "productos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> getProductos(){
		return productoService.getProductos();
	}
	
	@GetMapping(value = "productos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public double getProducto(@PathVariable int id){
		return productoService.getPrecioProducto(id);
	}
	
	@PutMapping(value = "productos", consumes= MediaType.APPLICATION_JSON_VALUE)
	public void updateProducto(@RequestBody Producto producto){
		productoService.updateProducto(producto);;
	}
	
	@PostMapping(value = "productos", consumes= MediaType.APPLICATION_JSON_VALUE)
	public void insertProducto(@RequestBody Producto producto){
		productoService.insertProducto(producto);;
	}
}
