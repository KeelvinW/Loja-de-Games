package com.generation.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.games.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

	public List<Produto>findAllByGeneroContainingIgnoreCase(@Param("genero") String genero); 
}
 