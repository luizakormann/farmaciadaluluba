package com.generation.farmaciadaluluba.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")

public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(length = 100)
	@NotBlank(message = "Defina a categoria!")
	@Size(min = 5, max = 100, message = "A categoria deve conter no mínimo 5 e no máximo 100 caractéres.")
	private String categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setTema(String categoria) {
		this.categoria = categoria;
	}

}
