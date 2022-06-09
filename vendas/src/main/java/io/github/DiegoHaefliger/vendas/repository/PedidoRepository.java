package io.github.DiegoHaefliger.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.DiegoHaefliger.vendas.entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
