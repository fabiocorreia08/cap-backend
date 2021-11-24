package br.gov.cmb.cap.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GRUPO_OLD")
public class GrupoOld implements Serializable{
	
	private static final long serialVersionUID = -7155667623160459644L;
	
	@Id
	@Column(name = "IdGrupo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGrupo;
	
	@Column(name = "CodEquip")
	private String codEquip;
	
	@Column(name = "CodGrupo")
	private String codGrupo;
	
	@Column(name = "NomGrupo")
	private String nomGrupo;

	public Long getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(Long idGrupo) {
		this.idGrupo = idGrupo;
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

	public String getNomGrupo() {
		return nomGrupo;
	}

	public void setNomGrupo(String nomGrupo) {
		this.nomGrupo = nomGrupo;
	}	
	
}
