package com.curso.service;

import java.util.List;

import com.curso.model.Pedido;

public interface PedidoService {
	
	List<Pedido> getPedidos();
	
	void savePedido (Pedido pedido);
	
}
