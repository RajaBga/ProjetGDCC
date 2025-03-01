package com.xtensus.xteldap.domain;

import java.util.Date;

// Generated 6 ao�t 2013 15:04:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "cahierclausesfinancierestechniques")
public class Cahierclausesfinancierestechniques  implements java.io.Serializable {

	private static final long serialVersionUID = 6752935714843474099L;
	private Long cahierClausesFinancieresTechniquesId;
	private Categoriesprojet categoriesprojet;
	private Typecahiercharges typecahiercharges;
	private Cahiercharges cahiercharges;
	private String cahierDesClauseFinancierTechnqueLibelle;
	private String cahierClausesFinancieresTechniquesDescription;
	private String cahierclausesfinancierestechniquescol;
	private Date 	CahierClauseFinancieresTechniquesReelDateCration;
	private Set<Criterescahierclausesfinancierestechniques> criterescahierclausesfinancierestechniqueses = new HashSet<Criterescahierclausesfinancierestechniques>(
			0);

	public Cahierclausesfinancierestechniques() {
	}

	public Cahierclausesfinancierestechniques(
			Typecahiercharges typecahiercharges, Cahiercharges cahiercharges) {
		this.typecahiercharges = typecahiercharges;
		this.cahiercharges = cahiercharges;
	}

	public Cahierclausesfinancierestechniques(
			Categoriesprojet categoriesprojet,
			Typecahiercharges typecahiercharges,
			Cahiercharges cahiercharges,
			String cahierDesClauseFinancierTechnqueLibelle,
			String cahierClausesFinancieresTechniquesDescription,
			String cahierclausesfinancierestechniquescol,
			Set<Criterescahierclausesfinancierestechniques> criterescahierclausesfinancierestechniqueses) {
		this.categoriesprojet = categoriesprojet;
		this.typecahiercharges = typecahiercharges;
		this.cahiercharges = cahiercharges;
		this.cahierDesClauseFinancierTechnqueLibelle = cahierDesClauseFinancierTechnqueLibelle;
		this.cahierClausesFinancieresTechniquesDescription = cahierClausesFinancieresTechniquesDescription;
		this.cahierclausesfinancierestechniquescol = cahierclausesfinancierestechniquescol;
		this.criterescahierclausesfinancierestechniqueses = criterescahierclausesfinancierestechniqueses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cahierClausesFinancieresTechniquesId", unique = true, nullable = false)
	public Long getCahierClausesFinancieresTechniquesId() {
		return this.cahierClausesFinancieresTechniquesId;
	}

	public void setCahierClausesFinancieresTechniquesId(
			Long cahierClausesFinancieresTechniquesId) {
		this.cahierClausesFinancieresTechniquesId = cahierClausesFinancieresTechniquesId;
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

	@Column(name = "CahierDesClauseFinancierTechnqueLibelle", length = 50)
	public String getCahierDesClauseFinancierTechnqueLibelle() {
		return this.cahierDesClauseFinancierTechnqueLibelle;
	}

	public void setCahierDesClauseFinancierTechnqueLibelle(
			String cahierDesClauseFinancierTechnqueLibelle) {
		this.cahierDesClauseFinancierTechnqueLibelle = cahierDesClauseFinancierTechnqueLibelle;
	}

	@Column(name = "cahierClausesFinancieresTechniquesDescription", length = 65535)
	public String getCahierClausesFinancieresTechniquesDescription() {
		return this.cahierClausesFinancieresTechniquesDescription;
	}

	public void setCahierClausesFinancieresTechniquesDescription(
			String cahierClausesFinancieresTechniquesDescription) {
		this.cahierClausesFinancieresTechniquesDescription = cahierClausesFinancieresTechniquesDescription;
	}

	@Column(name = "cahierclausesfinancierestechniquescol", length = 45)
	public String getCahierclausesfinancierestechniquescol() {
		return this.cahierclausesfinancierestechniquescol;
	}

	public void setCahierclausesfinancierestechniquescol(
			String cahierclausesfinancierestechniquescol) {
		this.cahierclausesfinancierestechniquescol = cahierclausesfinancierestechniquescol;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierclausesfinancierestechniques")
	public Set<Criterescahierclausesfinancierestechniques> getCriterescahierclausesfinancierestechniqueses() {
		return this.criterescahierclausesfinancierestechniqueses;
	}

	public void setCriterescahierclausesfinancierestechniqueses(
			Set<Criterescahierclausesfinancierestechniques> criterescahierclausesfinancierestechniqueses) {
		this.criterescahierclausesfinancierestechniqueses = criterescahierclausesfinancierestechniqueses;
	}
	@Column(name = "CahierClauseFinancieresTechniquesReelDateCration", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCahierClauseFinancieresTechniquesReelDateCration() {
		return CahierClauseFinancieresTechniquesReelDateCration;
	}

	public void setCahierClauseFinancieresTechniquesReelDateCration(Date cahierClauseFinancieresTechniquesReelDateCration) {
		CahierClauseFinancieresTechniquesReelDateCration = cahierClauseFinancieresTechniquesReelDateCration;
	}

}
