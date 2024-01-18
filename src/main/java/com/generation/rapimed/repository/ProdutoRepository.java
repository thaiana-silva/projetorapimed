package com.generation.rapimed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.rapimed.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	 // Método para buscar produtos por nome
   List<Produto> findByNomeContainingIgnoreCase(String nome);

   // Método para buscar produtos por fabricante
   List<Produto> findByFabricanteIgnoreCase(String fabricante);
   
}
