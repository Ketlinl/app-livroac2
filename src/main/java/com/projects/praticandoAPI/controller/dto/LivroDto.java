package com.projects.praticandoAPI.controller.dto;
import java.util.List;
import java.util.stream.Collectors;
import com.projects.praticandoAPI.modelo.Livro;


public class LivroDto {
	private Long id;
	private String nome;
	private String nomeusuario;
	private String plano;
	private String senha;
	
	public LivroDto(Livro livro) {
		super();
		this.id = livro.getId();
		this.nome = livro.getNome();
		this.nomeusuario = livro.getNomeUsuario();
		this.plano = livro.getPlano();
		this.senha = livro.getSenha();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}

	public String getNomeUsuario() {
		return nomeusuario;
	}

	
	public String getPlano() {
		return plano;
	}

	public String getSenha() {
		return senha;
	}

	
	public static List<LivroDto> converter(List<Livro> livros) {
		return livros.stream().map(LivroDto::new).collect(Collectors.toList());
	}
}
