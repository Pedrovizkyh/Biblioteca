package com.projeto.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Serializable{
	private static final long serialVersionUID = 1L;
	List<Livros> biblioteca = new ArrayList<>();

	public Biblioteca(Livros livros) {
		biblioteca.add(livros);
	}
	
	public Biblioteca() {
		
	}
	
	public List<Livros> getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Livros biblioteca) {
		this.biblioteca.add(biblioteca);
	}
	
	public void excluirLivro(String livro) {
		for(int i = 0; i < biblioteca.size(); i++) {
			Livros livros = biblioteca.get(i);
			
			if(livros.getLivro().equals(livro)) {
				biblioteca.remove(i);
				break;
			}
		}
	}
}

