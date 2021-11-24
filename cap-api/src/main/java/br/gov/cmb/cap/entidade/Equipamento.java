package br.gov.cmb.cap.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.gov.cmb.cap.enums.SimNaoEnum;

@Entity
@Table(name = "EQUIPAMENTO")
public class Equipamento implements Serializable{
		
	private static final long serialVersionUID = -7155667623160459644L;

	@Id
	@Column(name = "ID_EQUIPAMENTO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEquipamento;

	@Column(name = "CD_MANUTENCAO")
	private String codigoManutencao;

	@Column(name = "NM_EQUIPAMENTO")
	private String nomeEquipamento;

	@Column(name = "NR_PATRIMONIO")
	private String numeroPatrimonio;

	@Column(name = "NR_TENSAO")
	private Long numeroTensao;

	@Column(name = "NR_POTENCIA")
	private Long numeroPotencia;

	@Column(name = "NM_TIPO_POTENCIA")
	private String nomeTipoPotencia;

	@Column(name = "NR_PESO")
	private Long numeroPeso;

	@Column(name = "NR_ANO")
	private Long numeroAno;

	@Column(name = "DT_INSTALACAO")
	@Temporal(TemporalType.DATE)
	private Date dataInstalacao;

	@Column(name = "FL_PREVENTIVA")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagPreventiva;

	@Column(name = "DS_PRE_REQUISITO_INFORMACAO")
	private String descricaoPreRequisitoInformacao;

	@Column(name = "DS_OBSERVACAO")
	private String descricaoObservacao;	

	public Long getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Long idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getCodigoManutencao() {
		return codigoManutencao;
	}

	public void setCodigoManutencao(String codigoManutencao) {
		this.codigoManutencao = codigoManutencao;
	}

	public String getNomeEquipamento() {
		return nomeEquipamento;
	}

	public void setNomeEquipamento(String nomeEquipamento) {
		this.nomeEquipamento = nomeEquipamento;
	}

	public String getNumeroPatrimonio() {
		return numeroPatrimonio;
	}

	public void setNumeroPatrimonio(String numeroPatrimonio) {
		this.numeroPatrimonio = numeroPatrimonio;
	}

	public Long getNumeroTensao() {
		return numeroTensao;
	}

	public void setNumeroTensao(Long numeroTensao) {
		this.numeroTensao = numeroTensao;
	}

	public Long getNumeroPotencia() {
		return numeroPotencia;
	}

	public void setNumeroPotencia(Long numeroPotencia) {
		this.numeroPotencia = numeroPotencia;
	}

	public String getNomeTipoPotencia() {
		return nomeTipoPotencia;
	}

	public void setNomeTipoPotencia(String nomeTipoPotencia) {
		this.nomeTipoPotencia = nomeTipoPotencia;
	}

	public Long getNumeroPeso() {
		return numeroPeso;
	}

	public void setNumeroPeso(Long numeroPeso) {
		this.numeroPeso = numeroPeso;
	}

	public Long getNumeroAno() {
		return numeroAno;
	}

	public void setNumeroAno(Long numeroAno) {
		this.numeroAno = numeroAno;
	}

	public Date getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(Date dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
	}

	public SimNaoEnum getFlagPreventiva() {
		return flagPreventiva;
	}

	public void setFlagPreventiva(SimNaoEnum flagPreventiva) {
		this.flagPreventiva = flagPreventiva;
	}

	public String getDescricaoPreRequisitoInformacao() {
		return descricaoPreRequisitoInformacao;
	}

	public void setDescricaoPreRequisitoInformacao(String descricaoPreRequisitoInformacao) {
		this.descricaoPreRequisitoInformacao = descricaoPreRequisitoInformacao;
	}

	public String getDescricaoObservacao() {
		return descricaoObservacao;
	}

	public void setDescricaoObservacao(String descricaoObservacao) {
		this.descricaoObservacao = descricaoObservacao;
	}	

}
