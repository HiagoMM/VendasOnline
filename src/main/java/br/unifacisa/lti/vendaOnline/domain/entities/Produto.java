package br.unifacisa.lti.vendaOnline.domain.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotBlank
	@NotNull
	private String nome;
	@NotBlank
	@NotNull
	private Double preco;
	@NotBlank
	@NotNull
	private String descricao;
	@NotNull
	private Integer quantidade;
	
}
