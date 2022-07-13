package io.github.DiegoHaefliger.service;

import io.github.DiegoHaefliger.domain.entity.Pedido;
import io.github.DiegoHaefliger.domain.enums.StatusPedido;
import io.github.DiegoHaefliger.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
