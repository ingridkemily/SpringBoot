package com.example.atividade1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.atividade1.Models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Métodos específicos para Produto
}