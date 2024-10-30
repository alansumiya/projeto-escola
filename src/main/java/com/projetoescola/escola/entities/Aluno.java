package com.projetoescola.escola.entities;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer matricula_aluno;
	private String nome_aluno;
	private String endereco;
	private Integer telefone;
	private String cidade;
	
	public Aluno() {
		
	}

	public Aluno(Integer matricula_aluno, String nome_aluno, String endereco, Integer telefone, String cidade) {
		this.matricula_aluno = matricula_aluno;
		this.nome_aluno = nome_aluno;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cidade = cidade;
	}

	public Integer getMatricula_aluno() {
		return matricula_aluno;
	}

	public void setMatricula_aluno(Integer matricula_aluno) {
		this.matricula_aluno = matricula_aluno;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula_aluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula_aluno, other.matricula_aluno);
	}

	@Override
	public String toString() {
		return "Aluno [matricula_aluno=" + matricula_aluno + ", nome_aluno=" + nome_aluno + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", cidade=" + cidade + "]";
	}

	
	
	
	
	
	
}
