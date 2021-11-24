package br.gov.cmb.cap.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUBGRUPO_OLD")
public class SubGrupoOld implements Serializable{
	
	private static final long serialVersionUID = -7155667623160459644L;
	
	@Id
	@Column(name = "IdSubGrupo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSubGrupo;
	
	@Column(name = "CodEquip")
	private String codEquip;
	
	@Column(name = "CodGrupo")
	private String codGrupo;
	
	@Column(name = "CodSubGrupo")
	private String codSubGrupo;
	
	@Column(name = "NomSubGrupo")
	private String nomSubGrupo;
	
	@Column(name = "Prev")
	private String prev;

	public Long getIdSubGrupo() {
		return idSubGrupo;
	}

	public void setIdSubGrupo(Long idSubGrupo) {
		this.idSubGrupo = idSubGrupo;
	}

	public String getCodEquip() {
		return codEquip;
	}

	public void setCodEquip(String codEquip) {
		this.codEquip = codEquip;
	}

	public String getCodGrupo() {
		return codGrupo;
	}

	public void setCodGrupo(String codGrupo) {
		this.codGrupo = codGrupo;
	}

	public String getCodSubGrupo() {
		return codSubGrupo;
	}

	public void setCodSubGrupo(String codSubGrupo) {
		this.codSubGrupo = codSubGrupo;
	}

	public String getNomSubGrupo() {
		return nomSubGrupo;
	}

	public void setNomSubGrupo(String nomSubGrupo) {
		this.nomSubGrupo = nomSubGrupo;
	}

	public String getPrev() {
		return prev;
	}

	public void setPrev(String prev) {
		this.prev = prev;
	}	

}
