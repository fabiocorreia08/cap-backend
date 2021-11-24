package br.gov.cmb.cap.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Audited
@Entity
@Table(name = "HISTORICO_SITUACAO_EQUIPAMENTO")
public class HistoricoSituacaoEquipamento implements Serializable {

	private static final long serialVersionUID = -4751287550420827979L;

	@Id
	@Column(name = "ID_HISTORICO_SITUACAO_EQUIPAMENTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHistoricoSituacaoEquipamento;

	@Column(name = "FL_STATUS")	
	private String flagStatus;

	@Column(name = "CD_CENTRO_CUSTO")
	private String centroCusto;	

	@Column(name = "DT_INICIO")
	@Temporal(TemporalType.DATE)
	private Date dataInicio;

	@Column(name = "DT_FIM")
	@Temporal(TemporalType.DATE)
	private Date dataFim;

	@Column(name = "DS_OBSERVACAO")
	private String descricaoObservacao;

	@Column(name = "ID_EQUIPAMENTO")
	private Integer idEquipamento;

	public HistoricoSituacaoEquipamento() {

	}

	public HistoricoSituacaoEquipamento(Long id, String status, String centroCusto,
			Date dataInicio, Date dataFim, String observacao, Integer idEquipamento) {
		this.idHistoricoSituacaoEquipamento = id;
		this.flagStatus = status;
		this.centroCusto = centroCusto;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.descricaoObservacao = observacao;
		this.idEquipamento = idEquipamento;
		
	}

	public Long getIdHistoricoSituacaoEquipamento() {
		return idHistoricoSituacaoEquipamento;
	}

	public void setIdHistoricoSituacaoEquipamento(Long idHistoricoSituacaoEquipamento) {
		this.idHistoricoSituacaoEquipamento = idHistoricoSituacaoEquipamento;
	}

	public String getFlagStatus() {
		return flagStatus;
	}

	public void setFlagStatus(String flagStatus) {
		this.flagStatus = flagStatus;
	}	

	public String getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(String centroCusto) {
		this.centroCusto = centroCusto;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getDescricaoObservacao() {
		return descricaoObservacao;
	}

	public void setDescricaoObservacao(String descricaoObservacao) {
		this.descricaoObservacao = descricaoObservacao;
	}	

	public Integer getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Integer idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idHistoricoSituacaoEquipamento == null) ? 0 : idHistoricoSituacaoEquipamento.hashCode());
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
		HistoricoSituacaoEquipamento other = (HistoricoSituacaoEquipamento) obj;
		if (idHistoricoSituacaoEquipamento == null) {
			if (other.idHistoricoSituacaoEquipamento != null)
				return false;
		} else if (!idHistoricoSituacaoEquipamento.equals(other.idHistoricoSituacaoEquipamento))
			return false;
		return true;
	}

}
