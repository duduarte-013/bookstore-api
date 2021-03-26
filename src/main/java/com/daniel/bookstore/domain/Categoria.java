package com.daniel.bookstore.domain;

import java.util.List;

public class Categoria {
private Integer id;
private String nome; 
private String descricao;

private List<Livro> livros = new ArrayList<>();

public Categoria() {
	super();
	// TODO Auto-generated constructor stub
}


}
