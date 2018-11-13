package br.unifacisa.lti.vendaOnline.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.unifacisa.lti.vendaOnline.enums.FormaPagamento;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Carrinho {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private Usuario comprador;
	@NotNull
	private List<Transacao> transacoes;
	@NotNull
	private FormaPagamento formaPagamento;
}
