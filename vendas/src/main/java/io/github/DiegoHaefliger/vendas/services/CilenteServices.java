package io.github.DiegoHaefliger.vendas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import io.github.DiegoHaefliger.vendas.entity.Cliente;
import io.github.DiegoHaefliger.vendas.repository.ClienteRepository;

public class CilenteServices {

	@Autowired
	private ClienteRepository repository;

	public Optional<Cliente> findById(Integer id) {
		Optional<Cliente> cliente = repository.findById(id);
		return cliente;
//		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public Cliente save(Cliente cliente) {
		return repository.save(cliente);
	}

//	public List<Cliente> NomeOrId{
//		List<Cliente> findByNomeOrIdOrderById(String nome, Integer id);
//	}

//	public List<Cliente> PorNome(String nome){
//		List<Cliente> findByNomeLike(String nome)
//	}

//	public boolean ExistePorNome(String nome){
//	boolean existsByNome(String nome)
//}

}
