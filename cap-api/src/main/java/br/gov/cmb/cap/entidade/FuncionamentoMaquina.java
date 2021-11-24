package br.gov.cmb.cap.entidade;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//@Audited
@Entity
@Table(name = "FUNCIONAMENTO_MAQUINA")
public class FuncionamentoMaquina implements Serializable {

	private static final long serialVersionUID = 6438782730968559276L;

	@Id
	@Column(name = "ID_FUNCIONAMENTO_MAQUINA")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ID_EQUIPAMENTO")
	private Integer idEquipamento;

	@Column(name = "CD_CENTRO_CUSTO")
	private String centroCusto;

	@Column(name = "NR_ANO")
	private Integer ano;

	@Column(name = "NR_MES")
	private Integer mes;

	@Column(name = "QT_HORAS_PADRAO")
	private Integer quantidadeHorasPadrao;

	@Column(name = "CD_USUARIO_ULT_ALT")
	private String codigoUsuario;

	@Column(name = "DT_ALTERACAO")
	private Timestamp dataUltimaAlteracao;

	@OneToMany(mappedBy="funcionamentoMaquina", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JsonManagedReference
	private List<FuncionamentoMaquinaDia> diasFuncionamento;	 

	public FuncionamentoMaquina() {
		super();
	}
	
	public FuncionamentoMaquina(Long id, Integer idEquipamento, String codigoCentroCusto, Integer ano, Integer mes,
			Integer quantidadeHorasPadrao, String codigoUsuario, Timestamp dataUltimaAlteracao,
			List<FuncionamentoMaquinaDia> diasFuncionamento) {
		super();
		this.id = id;
		this.idEquipamento = idEquipamento;
		this.centroCusto = codigoCentroCusto;
		this.ano = ano;
		this.mes = mes;
		this.quantidadeHorasPadrao = quantidadeHorasPadrao;
		this.codigoUsuario = codigoUsuario;
		this.dataUltimaAlteracao = dataUltimaAlteracao;
		this.diasFuncionamento = diasFuncionamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Integer idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Integer getQuantidadeHorasPadrao() {
		return quantidadeHorasPadrao;
	}

	public void setQuantidadeHorasPadrao(Integer quantidadeHorasPadrao) {
		this.quantidadeHorasPadrao = quantidadeHorasPadrao;
	}

	public List<FuncionamentoMaquinaDia> getDiasFuncionamento() { 
		return diasFuncionamento; 
	}
	  
	public void setDiasFuncionamento(List<FuncionamentoMaquinaDia> diasFuncionamento) { 
		this.diasFuncionamento = diasFuncionamento; 
	}
	 

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public Timestamp getDataUltimaAlteracao() {
		return dataUltimaAlteracao;
	}

	public void setDataUltimaAlteracao(Timestamp dataUltimaAlteracao) {
		this.dataUltimaAlteracao = dataUltimaAlteracao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FuncionamentoMaquina other = (FuncionamentoMaquina) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
