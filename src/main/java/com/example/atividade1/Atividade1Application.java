package com.example.atividade1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.atividade1.Controller.CategoriaController;
import com.example.atividade1.Controller.ProdutoController;
import com.example.atividade1.Models.Categoria;
import com.example.atividade1.Models.Produto;

@SpringBootApplication
public class Atividade1Application {

	@Bean
	public CommandLineRunner init(@Autowired ProdutoController produtoController, @Autowired CategoriaController categoriaController) {
		return (args) -> {

			// Inserir categorias
			Categoria categoria1 = new Categoria();
			categoria1.setNome("Eletrônicos");
			categoria1.setDescricao("Produtos eletrônicos em geral");
			categoriaController.inserirCategoria(categoria1);
	
			Categoria categoria2 = new Categoria();
			categoria2.setNome("Roupas");
			categoria2.setDescricao("Roupas de diferentes estilos");
			categoriaController.inserirCategoria(categoria2);
	
			// Inserir produtos
			
			Produto produto1 = new Produto();
			produto1.setNome("Smartphone");
			produto1.setQuantidade(10);
			produto1.setCategoria(categoria1);
			produtoController.inserirProduto(produto1);
	
			Produto produto2 = new Produto();
			produto2.setNome("Camiseta");
			produto2.setQuantidade(20);
			produto2.setCategoria(categoria2);
			produtoController.inserirProduto(produto2);
	
			// Exibir todas as categorias
			System.out.println("=== Categorias ===");
			categoriaController.mostrarTodasCategorias().forEach(System.out::println);
	
			// Exibir todos os produtos
			System.out.println("=== Produtos ===");
			produtoController.mostrarTodosProdutos().forEach(System.out::println);
		};
	}
    public static void main(String[] args) {
        SpringApplication.run(Atividade1Application.class, args);

    }
}
