package com.curso.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.PedidoDao;
import com.curso.model.Pedido;
import com.curso.model.Producto;

@Service
public class PedidoServiceImpl implements PedidoService {
	
	private static final String URL = "http://localhost:8000/productos";
	
	@Autowired
	private PedidoDao pedidoDao;
	
	@Autowired
	RestTemplate template;

	@Override
	public List<Pedido> getPedidos() {
		return pedidoDao.findAll();
	}
	
	/*
	 * Llama al microservicio de productos para obtener todos los productos, si el pedido se realiza con un producto existente
	 * se resta el stock del producto y se crea un nuevo pedido
	 */
	@Override
	public void savePedido(Pedido pedido) {
		Optional<Producto> producto =
				Stream.of(template.getForObject(URL, Producto[].class))
				.filter(p -> p.getIdProducto() == (pedido.getIdProducto()))
				.findAny();
		producto.ifPresent(p->{
			p.setStock(p.getStock()-pedido.getUnidades());
			template.put(URL, producto);
			pedidoDao.save(pedido);
		});
		
		
	}

}
