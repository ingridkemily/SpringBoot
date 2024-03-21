package com.example.atividade1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.atividade1.Models.Categoria;
import com.example.atividade1.Repositories.CategoriaRepository;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping("/inserir")
    public void inserirCategoria(@RequestBody Categoria categoria) {
        categoriaRepository.save(categoria);
    }

    @GetMapping("/mostrarTodos")
    public List<Categoria> mostrarTodasCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        return categorias;
    }
}
