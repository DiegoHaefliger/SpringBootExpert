package io.github.DiegoHaefliger.vendas.services.impl;

import org.springframework.stereotype.Service;

import io.github.DiegoHaefliger.vendas.repository.PedidoRepository;
import io.github.DiegoHaefliger.vendas.services.PedidoService;

@Service
public class PedidoImpl implements PedidoService {
    
    private PedidoRepository repository;

    public PedidoImpl(PedidoRepository repository) {	
	this.repository = repository;
    }
       
}
