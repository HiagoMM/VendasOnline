package br.unifacisa.lti.vendaOnline.domain.entities;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Dados {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	@NotBlank
	@NotNull
	private Date DataDeNascimento;
	@NotBlank
	@NotNull
	@CPF
	private String cpf;
	private String cartao;
	@NotBlank
	@NotNull
	private String email;

}
