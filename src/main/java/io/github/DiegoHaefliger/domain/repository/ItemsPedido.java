package io.github.DiegoHaefliger.domain.repository;

import io.github.DiegoHaefliger.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
