package com.generation.rapimed.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table (name ="tb_produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min=3, message = "O nome deve ter no minimo 3 caracteres")
	@NotBlank(message = "Atributo nome é obrigatório")
    private String nome;
    
    @Size(min=3, message = "A descrição deve ter no minimo 3 caracteres")
	@NotBlank(message = "Atributo descrição é obrigatório")
    private String descricao;
    
    private double preco;
    
    @Size(min=3, message = "O fabricante deve ter no minimo 3 caracteres")
	@NotBlank(message = "Atributo fabricante é obrigatório")
    private String fabricante;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;

    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Usuario usuario;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
    
}
