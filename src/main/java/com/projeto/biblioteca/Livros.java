package com.projeto.biblioteca;

public class Livros {
	private String livro;
	private String autor;
	private int ano;
	
	public Livros(String livro, String autor, int ano) {
		super();
		this.livro = livro;
		this.autor = autor;
		this.ano = ano;
	}

	public Livros() {
		
	}

	public String getLivro() {
		return livro;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
}
