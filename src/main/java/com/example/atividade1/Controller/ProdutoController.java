package com.example.atividade1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.atividade1.Models.Produto;
import com.example.atividade1.Repositories.ProdutoRepository;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping("/inserir")
    public void inserirProduto(@RequestBody Produto produto) {
        produtoRepository.save(produto);
    }

    @GetMapping("/mostrarTodos")
    public List<Produto> mostrarTodosProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos;
    }
}

