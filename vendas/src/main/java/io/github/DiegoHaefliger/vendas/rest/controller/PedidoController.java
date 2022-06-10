package io.github.DiegoHaefliger.vendas.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.DiegoHaefliger.vendas.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private PedidoService service;
    
    public PedidoController(PedidoService service) {
	this.service = service;
    }
    
    
}
