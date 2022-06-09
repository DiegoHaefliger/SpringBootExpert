package io.github.DiegoHaefliger.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.DiegoHaefliger.vendas.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
