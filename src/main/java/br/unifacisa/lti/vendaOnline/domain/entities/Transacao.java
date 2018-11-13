package br.unifacisa.lti.vendaOnline.domain.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



import br.unifacisa.lti.vendaOnline.enums.StatusDaTransacao;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Transacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotBlank
	@NotNull
	@OneToOne
	private Usuario vendedor;
	@NotBlank
	@NotNull
	@OneToMany
	private List<Produto> produtos;
	
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date data = new Date(new java.util.Date().getTime());
	private StatusDaTransacao status;

}
