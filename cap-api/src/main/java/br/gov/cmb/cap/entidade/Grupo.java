package br.gov.cmb.cap.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.gov.cmb.cap.enums.SimNaoEnum;

@Entity
@Table(name = "GRUPO")
public class Grupo implements Serializable {

	private static final long serialVersionUID = 4773149359131257721L;

	@Id
	@Column(name = "ID_GRUPO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGrupo;

	@ManyToOne
	@JoinColumn(name = "ID_EQUIPAMENTO")
	private Equipamento equipamento;

	@OneToOne
	@JoinColumn(name = "ID_GRUPO_PAI")
	private Grupo grupoPai;

	@Column(name = "CD_SEQUENCIA")
	private String codigoSequencia;

	//@OneToMany(mappedBy = "grupoPai")
	//private List<Grupo> subgrupos = new ArrayList<>();

	@Column(name = "DS_GRUPO")
	private String descricaoGrupo;

	@Column(name = "FL_MECANICO")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagMecanico;

	@Column(name = "FL_ELETRICISTA")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagEletricista;

	@Column(name = "FL_ELETRONICO")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagEletronico;

	@Column(name = "FL_TI")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagTI;

	@Column(name = "FL_UTILIDADES")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagUtilidades;

	@Column(name = "FL_ENGENHARIA")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagEngenharia;

	@Column(name = "FL_PREVENTIVA")
	@Enumerated(EnumType.STRING)
	private SimNaoEnum flagPreventiva;

	@Column(name = "DS_OBSERVACAO")
	private String descricaoObservacao;

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Grupo getGrupoPai() {
		return grupoPai;
	}

	public void setGrupoPai(Grupo grupoPai) {
		this.grupoPai = grupoPai;
	}

	public String getCodigoSequencia() {
		return codigoSequencia;
	}

	public void setCodigoSequencia(String codigoSequencia) {
		this.codigoSequencia = codigoSequencia;
	}

	/*
	 * public List<Grupo> getSubgrupos() { return subgrupos; }
	 * 
	 * public void setSubgrupos(List<Grupo> subgrupos) { this.subgrupos = subgrupos;
	 * }
	 */

	public String getDescricaoGrupo() {
		return descricaoGrupo;
	}

	public void setDescricaoGrupo(String descricaoGrupo) {
		this.descricaoGrupo = descricaoGrupo;
	}

	public SimNaoEnum getFlagMecanico() {
		return flagMecanico;
	}

	public void setFlagMecanico(SimNaoEnum flagMecanico) {
		this.flagMecanico = flagMecanico;
	}

	public SimNaoEnum getFlagEletricista() {
		return flagEletricista;
	}

	public void setFlagEletricista(SimNaoEnum flagEletricista) {
		this.flagEletricista = flagEletricista;
	}

	public SimNaoEnum getFlagEletronico() {
		return flagEletronico;
	}

	public void setFlagEletronico(SimNaoEnum flagEletronico) {
		this.flagEletronico = flagEletronico;
	}

	public SimNaoEnum getFlagTI() {
		return flagTI;
	}

	public void setFlagTI(SimNaoEnum flagTI) {
		this.flagTI = flagTI;
	}

	public SimNaoEnum getFlagUtilidades() {
		return flagUtilidades;
	}

	public void setFlagUtilidades(SimNaoEnum flagUtilidades) {
		this.flagUtilidades = flagUtilidades;
	}

	public SimNaoEnum getFlagEngenharia() {
		return flagEngenharia;
	}

	public void setFlagEngenharia(SimNaoEnum flagEngenharia) {
		this.flagEngenharia = flagEngenharia;
	}

	public SimNaoEnum getFlagPreventiva() {
		return flagPreventiva;
	}

	public void setFlagPreventiva(SimNaoEnum flagPreventiva) {
		this.flagPreventiva = flagPreventiva;
	}

	public String getDescricaoObservacao() {
		return descricaoObservacao;
	}

	public void setDescricaoObservacao(String descricaoObservacao) {
		this.descricaoObservacao = descricaoObservacao;
	}

}
