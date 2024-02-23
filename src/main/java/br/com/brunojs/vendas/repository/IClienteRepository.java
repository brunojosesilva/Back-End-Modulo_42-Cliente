package br.com.brunojs.vendas.repository;

import br.com.brunojs.vendas.domain.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Criado para ser uma interface do repositorio do banco de dados.
 */
@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {

    Optional<Cliente> findByCpf(Long cpf);
}