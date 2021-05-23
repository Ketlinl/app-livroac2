package com.projects.praticandoAPI.controller.form;

import com.projects.praticandoAPI.modelo.Livro;
import com.projects.praticandoAPI.repository.LivroRepository;

public class LivroForm {
	private String nome;
	private String nomeusuario;
	private String plano;
	private String senha;
	
	public String getNome() {
		return nome;
	}

	public void setNomeLivro(String nome) {
		this.nome = nome;
	}

	public String getNomeUsuario() {
		return nomeusuario;
	}

	public void setNomeUsuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
     public Livro converter(LivroRepository livroRepository) {
		
		return new Livro(nome,nomeusuario, plano, senha);
	}
}
