package com.xtensus.xteldap.domain;


import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "typecahiercharges")
public class Typecahiercharges   implements java.io.Serializable {

	private static final long serialVersionUID = 6678940777576782748L;
	private Long typeCahierChargesId;
	private Typecritere typecritere;
	private String typeCahierChargesDescription;
	private String typeCahierChargesLibelle;
	private int ordre;
	private Set<Cahierclausesadministratives> cahierclausesadministrativeses = new HashSet<Cahierclausesadministratives>(
			0);
	private Set<Cahierclausesfinancierestechniques> cahierclausesfinancierestechniqueses = new HashSet<Cahierclausesfinancierestechniques>(
			0);

	public Typecahiercharges() {
	}

	public Typecahiercharges(
			Typecritere typecritere,
			String typeCahierChargesDescription,
			String typeCahierChargesLibelle,
			Set<Cahierclausesadministratives> cahierclausesadministrativeses,
			Set<Cahierclausesfinancierestechniques> cahierclausesfinancierestechniqueses) {
		this.typecritere = typecritere;
		this.typeCahierChargesDescription = typeCahierChargesDescription;
		this.typeCahierChargesLibelle = typeCahierChargesLibelle;
		this.cahierclausesadministrativeses = cahierclausesadministrativeses;
		this.cahierclausesfinancierestechniqueses = cahierclausesfinancierestechniqueses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "typeCahierChargesId", unique = true, nullable = false)
	public Long getTypeCahierChargesId() {
		return this.typeCahierChargesId;
	}

	public void setTypeCahierChargesId(Long typeCahierChargesId) {
		this.typeCahierChargesId = typeCahierChargesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeCahierChargeIdType")

	public Typecritere getTypecritere() {
		return this.typecritere;
	}

	public void setTypecritere(Typecritere typecritere) {
		this.typecritere = typecritere;
	}

	@Column(name = "typeCahierChargesDescription", length = 65535)
	public String getTypeCahierChargesDescription() {
		return this.typeCahierChargesDescription;
	}

	public void setTypeCahierChargesDescription(
			String typeCahierChargesDescription) {
		this.typeCahierChargesDescription = typeCahierChargesDescription;
	}

	@Column(name = "typeCahierChargesLibelle", length = 50)
	public String getTypeCahierChargesLibelle() {
		return this.typeCahierChargesLibelle;
	}

	public void setTypeCahierChargesLibelle(String typeCahierChargesLibelle) {
		this.typeCahierChargesLibelle = typeCahierChargesLibelle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecahiercharges")


	@Fetch(value = FetchMode.SUBSELECT)
    @JsonIgnore
	public Set<Cahierclausesadministratives> getCahierclausesadministrativeses() {
		return this.cahierclausesadministrativeses;
	}

	public void setCahierclausesadministrativeses(
			Set<Cahierclausesadministratives> cahierclausesadministrativeses) {
		this.cahierclausesadministrativeses = cahierclausesadministrativeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecahiercharges")


	@Fetch(value = FetchMode.SUBSELECT)
	public Set<Cahierclausesfinancierestechniques> getCahierclausesfinancierestechniqueses() {
		return this.cahierclausesfinancierestechniqueses;
	}

	public void setCahierclausesfinancierestechniqueses(
			Set<Cahierclausesfinancierestechniques> cahierclausesfinancierestechniqueses) {
		this.cahierclausesfinancierestechniqueses = cahierclausesfinancierestechniqueses;
	}
	@Column(name = "ordre")
	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}
