package br.gov.cmb.cap.entidade;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

//@Audited
@Entity
@Table(name = "FUNCIONAMENTO_MAQUINA_DIA")
public class FuncionamentoMaquinaDia implements Serializable {

	private static final long serialVersionUID = -4286323100604911169L;

	@Id
	@Column(name = "ID_FUNCIONAMENTO_MAQUINA_DIA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="ID_FUNCIONAMENTO_MAQUINA")
	@JsonBackReference
	private FuncionamentoMaquina funcionamentoMaquina;

	@Column(name = "NR_DIA")
	private Integer numeroDia;

	@Column(name = "QT_HORAS")
	private Integer quantidadeHoras;

	public FuncionamentoMaquinaDia() {
		super();
	}

	public FuncionamentoMaquinaDia(Integer numeroDia, Integer quantidadeHoras) {
		super();
		this.numeroDia = numeroDia;
		this.quantidadeHoras = quantidadeHoras;
	}

	public FuncionamentoMaquinaDia(Long id, Integer numeroDia, Integer quantidadeHoras) {
		super();
		this.id = id;
		this.numeroDia = numeroDia;
		this.quantidadeHoras = quantidadeHoras;
	}

	public FuncionamentoMaquinaDia(Long id, Integer numeroDia, Integer quantidadeHoras,
			FuncionamentoMaquina funcionamento) {
		super();
		this.id = id;
		this.numeroDia = numeroDia;
		this.quantidadeHoras = quantidadeHoras;
		this.funcionamentoMaquina = funcionamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FuncionamentoMaquina getFuncionamentoMaquina() {
		return funcionamentoMaquina;
	}

	public void setFuncionamentoMaquina(FuncionamentoMaquina funcionamentoMaquina) {
		this.funcionamentoMaquina = funcionamentoMaquina;
	}

	public Integer getNumeroDia() {
		return numeroDia;
	}

	public void setNumeroDia(Integer numeroDia) {
		this.numeroDia = numeroDia;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
}
