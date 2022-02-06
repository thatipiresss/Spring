package br.org.generation.lojagames.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table (name = "tb_usuarios")
public class Usuario {

	//id nome, email, senha, data de nascimento
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull (message = "O campo 'nome' é obrigatório!")
	private String nome;
	
	@NotBlank (message = "O campo 'usuário' é obrigatório e não pode conter espaços em branco!")
	@Email (message = "Usário inválido! Favor inserir no formato @email.com ou @email.com.br")
	private String usuario;
	
	@NotBlank (message = "O campo 'senha' é obrigatório!")
	@Size (min = 8, message = "O campo 'senha' deve ter no mínimo 8 caractéres!")
	private int senha;
	
	private String foto;
	
	@Column(name = "data_nascimento")
	@JsonFormat(pattern = "yyy-MM-dd")
	@NotNull (message = "O campo 'data de nascimento' é obrigatório!")
	private LocalDate dataNascimento;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	
}
