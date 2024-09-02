package com.projeto.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.model.Biblioteca;
import com.projeto.model.Livros;

@RestController
@RequestMapping(value = "/api")
public class Saida {
	private final Biblioteca biblioteca = new Biblioteca();
	
    @PostMapping("/livros")
    public ResponseEntity<Livros> addLivro(@RequestBody Livros livro) {
        biblioteca.setBiblioteca(livro);
        return ResponseEntity.ok().body(livro);
    }

    @GetMapping("/livros")
    public ResponseEntity<List<Livros>> findAll() {
        return ResponseEntity.ok().body(biblioteca.getBiblioteca());
    }
}
