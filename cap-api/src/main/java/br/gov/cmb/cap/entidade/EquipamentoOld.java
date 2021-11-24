package br.gov.cmb.cap.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EQUIPAMENTO_OLD")
public class EquipamentoOld implements Serializable{
	
	private static final long serialVersionUID = -7155667623160459644L;
	
	@Id
	@Column(name = "CodEquip")
	private String codEquip;
	
	@Column(name = "NomEquip")
	private String nomEquip;
	
	@Column(name = "CCusto")
	private String cCusto;
	
	@Column(name = "Sigla")
	private String sigla;
	
	@Column(name = "DtP01")
	private Date dtP01;
	
	@Column(name = "DtP02")
	private Date dtP02;

	public String getCodEquip() {
		return codEquip;
	}

	public void setCodEquip(String codEquip) {
		this.codEquip = codEquip;
	}

	public String getNomEquip() {
		return nomEquip;
	}

	public void setNomEquip(String nomEquip) {
		this.nomEquip = nomEquip;
	}

	public String getcCusto() {
		return cCusto;
	}

	public void setcCusto(String cCusto) {
		this.cCusto = cCusto;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Date getDtP01() {
		return dtP01;
	}

	public void setDtP01(Date dtP01) {
		this.dtP01 = dtP01;
	}

	public Date getDtP02() {
		return dtP02;
	}

	public void setDtP02(Date dtP02) {
		this.dtP02 = dtP02;
	}

}
