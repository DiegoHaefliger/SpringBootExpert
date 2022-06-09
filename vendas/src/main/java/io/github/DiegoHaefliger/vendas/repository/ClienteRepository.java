package io.github.DiegoHaefliger.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.DiegoHaefliger.vendas.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
