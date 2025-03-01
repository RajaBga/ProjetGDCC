package com.xtensus.xteldap.domain;

import java.util.Date;

// Generated 6 ao�t 2013 15:04:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "cahierclausesadministratives")
public class Cahierclausesadministratives  implements java.io.Serializable {


	private static final long serialVersionUID = -4405622908955932464L;
	private Long cahierClausesAdministrativesId;
	private Categoriesprojet categoriesprojet;
	private Typecahiercharges typecahiercharges;
	private Cahiercharges cahiercharges;
	private String cahierClausesAdministrativesLibelle;
	private String cahierClausesAdministrativeDescription;
	private Date CahierClauseAdministrativeReelDateCreation;
	private Set<Criterescahierclausesadministratives> criterescahierclausesadministrativeses = new HashSet<Criterescahierclausesadministratives>(
			0);

	public Cahierclausesadministratives() {
	}

	public Cahierclausesadministratives(Cahiercharges cahiercharges) {
		this.cahiercharges = cahiercharges;
	}

	public Cahierclausesadministratives(
			Categoriesprojet categoriesprojet,
			Typecahiercharges typecahiercharges,
			Cahiercharges cahiercharges,
			String cahierClausesAdministrativesLibelle,
			String cahierClausesAdministrativeDescription,
			Set<Criterescahierclausesadministratives> criterescahierclausesadministrativeses) {
		this.categoriesprojet = categoriesprojet;
		this.typecahiercharges = typecahiercharges;
		this.cahiercharges = cahiercharges;
		this.cahierClausesAdministrativesLibelle = cahierClausesAdministrativesLibelle;
		this.cahierClausesAdministrativeDescription = cahierClausesAdministrativeDescription;
		this.criterescahierclausesadministrativeses = criterescahierclausesadministrativeses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cahierClausesAdministrativesId", unique = true, nullable = false)
	public Long getCahierClausesAdministrativesId() {
		return this.cahierClausesAdministrativesId;
	}

	public void setCahierClausesAdministrativesId(
			Long cahierClausesAdministrativesId) {
		this.cahierClausesAdministrativesId = cahierClausesAdministrativesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoriesProjetId")
	public Categoriesprojet getCategoriesprojet() {
		return this.categoriesprojet;
	}

	public void setCategoriesprojet(Categoriesprojet categoriesprojet) {
		this.categoriesprojet = categoriesprojet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeCahierDesChargesId")
	public Typecahiercharges getTypecahiercharges() {
		return this.typecahiercharges;
	}

	public void setTypecahiercharges(Typecahiercharges typecahiercharges) {
		this.typecahiercharges = typecahiercharges;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cahierChargesId")
	public Cahiercharges getCahiercharges() {
		return this.cahiercharges;
	}

	public void setCahiercharges(Cahiercharges cahiercharges) {
		this.cahiercharges = cahiercharges;
	}

	@Column(name = "cahierClausesAdministrativesLibelle", length = 100)
	public String getCahierClausesAdministrativesLibelle() {
		return this.cahierClausesAdministrativesLibelle;
	}

	public void setCahierClausesAdministrativesLibelle(
			String cahierClausesAdministrativesLibelle) {
		this.cahierClausesAdministrativesLibelle = cahierClausesAdministrativesLibelle;
	}

	@Column(name = "cahierClausesAdministrativeDescription", length = 65535)
	public String getCahierClausesAdministrativeDescription() {
		return this.cahierClausesAdministrativeDescription;
	}

	public void setCahierClausesAdministrativeDescription(
			String cahierClausesAdministrativeDescription) {
		this.cahierClausesAdministrativeDescription = cahierClausesAdministrativeDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierclausesadministratives")
	public Set<Criterescahierclausesadministratives> getCriterescahierclausesadministrativeses() {
		return this.criterescahierclausesadministrativeses;
	}

	public void setCriterescahierclausesadministrativeses(
			Set<Criterescahierclausesadministratives> criterescahierclausesadministrativeses) {
		this.criterescahierclausesadministrativeses = criterescahierclausesadministrativeses;
	}
	@Column(name = "CahierClauseAdministrativeReelDateCreation", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCahierClauseAdministrativeReelDateCreation() {
		return CahierClauseAdministrativeReelDateCreation;
	}

	public void setCahierClauseAdministrativeReelDateCreation(Date cahierClauseAdministrativeReelDateCreation) {
		CahierClauseAdministrativeReelDateCreation = cahierClauseAdministrativeReelDateCreation;
	}
}
