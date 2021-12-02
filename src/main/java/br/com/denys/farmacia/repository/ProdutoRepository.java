package br.com.denys.farmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.denys.farmacia.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short> {

}
