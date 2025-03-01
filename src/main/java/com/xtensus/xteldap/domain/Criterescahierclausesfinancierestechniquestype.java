package com.xtensus.xteldap.domain;

import java.sql.Timestamp;
import java.util.Date;

// Generated 30 juil. 2013 11:40:13 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "criterescahierclausesfinancierestechniquestype")
public class Criterescahierclausesfinancierestechniquestype  implements
		java.io.Serializable {


	private static final long serialVersionUID = -7783672894632607356L;
	private CriterescahierclausesfinancierestechniquestypeId id;
	private Criterestype criterestype;
	private Cahierclausesfinancierestechniquestype cahierclausesfinancierestechniquestype;
	private Integer criteresCahierClausesFinancieresTechniquesValeur;
	private Boolean criteresCahierClausesFinancieresTechniquesElimination;
	private Integer criteresCahierClausesFinancieresTechniquesBareme;
	private Integer criteresCahierClausesFinancieresTechniquesQuantite=0;
	private Float criteresCahierClausesFinancieresTechniquesBudjet;
	private Long criteresCahierClausesFinancieresTechniquesIdCritereAffecter;

	private Set<Intervallestype> intervallestypes = new HashSet<Intervallestype>(
			0);

	public Criterescahierclausesfinancierestechniquestype() {
	}

	public Criterescahierclausesfinancierestechniquestype(
			CriterescahierclausesfinancierestechniquestypeId id,
			Criterestype criterestype,
			Cahierclausesfinancierestechniquestype cahierclausesfinancierestechniquestype) {
		this.id = id;
		this.criterestype = criterestype;
		this.cahierclausesfinancierestechniquestype = cahierclausesfinancierestechniquestype;
	}

	public Criterescahierclausesfinancierestechniquestype(
			CriterescahierclausesfinancierestechniquestypeId id,
			Criterestype criterestype,
			Cahierclausesfinancierestechniquestype cahierclausesfinancierestechniquestype,
			Integer criteresCahierClausesFinancieresTechniquesValeur,
			Boolean criteresCahierClausesFinancieresTechniquesElimination,
			Integer criteresCahierClausesFinancieresTechniquesBareme,
			Integer criteresCahierClausesFinancieresTechniquesQuantite,
			Float criteresCahierClausesFinancieresTechniquesBudjet,
			Long criteresCahierClausesFinancieresTechniquesIdCritereAffecter,
			Set<Intervallestype> intervallestypes) {
		this.id = id;
		this.criterestype = criterestype;
		this.cahierclausesfinancierestechniquestype = cahierclausesfinancierestechniquestype;
		this.criteresCahierClausesFinancieresTechniquesValeur = criteresCahierClausesFinancieresTechniquesValeur;
		this.criteresCahierClausesFinancieresTechniquesElimination = criteresCahierClausesFinancieresTechniquesElimination;
		this.criteresCahierClausesFinancieresTechniquesBareme = criteresCahierClausesFinancieresTechniquesBareme;
		this.criteresCahierClausesFinancieresTechniquesQuantite = criteresCahierClausesFinancieresTechniquesQuantite;
		this.criteresCahierClausesFinancieresTechniquesBudjet = criteresCahierClausesFinancieresTechniquesBudjet;
		this.criteresCahierClausesFinancieresTechniquesIdCritereAffecter = criteresCahierClausesFinancieresTechniquesIdCritereAffecter;
		this.intervallestypes = intervallestypes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cahierClausesFinancieresTechniquesId", column = @Column(name = "cahierClausesFinancieresTechniquesId", nullable = false)),
			@AttributeOverride(name = "criteresId", column = @Column(name = "criteresId", nullable = false)) })
	public CriterescahierclausesfinancierestechniquestypeId getId() {
		return this.id;
	}

	public void setId(CriterescahierclausesfinancierestechniquestypeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "criteresId", nullable = false, insertable = false, updatable = false)
	public Criterestype getCriterestype() {
		return this.criterestype;
	}

	public void setCriterestype(Criterestype criterestype) {
		this.criterestype = criterestype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cahierClausesFinancieresTechniquesId", nullable = false, insertable = false, updatable = false)
	public Cahierclausesfinancierestechniquestype getCahierclausesfinancierestechniquestype() {
		return this.cahierclausesfinancierestechniquestype;
	}

	public void setCahierclausesfinancierestechniquestype(
			Cahierclausesfinancierestechniquestype cahierclausesfinancierestechniquestype) {
		this.cahierclausesfinancierestechniquestype = cahierclausesfinancierestechniquestype;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesValeur")
	public Integer getCriteresCahierClausesFinancieresTechniquesValeur() {
		return this.criteresCahierClausesFinancieresTechniquesValeur;
	}

	public void setCriteresCahierClausesFinancieresTechniquesValeur(
			Integer criteresCahierClausesFinancieresTechniquesValeur) {
		this.criteresCahierClausesFinancieresTechniquesValeur = criteresCahierClausesFinancieresTechniquesValeur;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesElimination")
	public Boolean getCriteresCahierClausesFinancieresTechniquesElimination() {
		return this.criteresCahierClausesFinancieresTechniquesElimination;
	}

	public void setCriteresCahierClausesFinancieresTechniquesElimination(
			Boolean criteresCahierClausesFinancieresTechniquesElimination) {
		this.criteresCahierClausesFinancieresTechniquesElimination = criteresCahierClausesFinancieresTechniquesElimination;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesBareme")
	public Integer getCriteresCahierClausesFinancieresTechniquesBareme() {
		return this.criteresCahierClausesFinancieresTechniquesBareme;
	}

	public void setCriteresCahierClausesFinancieresTechniquesBareme(
			Integer criteresCahierClausesFinancieresTechniquesBareme) {
		this.criteresCahierClausesFinancieresTechniquesBareme = criteresCahierClausesFinancieresTechniquesBareme;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesQuantite")
	public Integer getCriteresCahierClausesFinancieresTechniquesQuantite() {
		return this.criteresCahierClausesFinancieresTechniquesQuantite;
	}

	public void setCriteresCahierClausesFinancieresTechniquesQuantite(
			Integer criteresCahierClausesFinancieresTechniquesQuantite) {
		this.criteresCahierClausesFinancieresTechniquesQuantite = criteresCahierClausesFinancieresTechniquesQuantite;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesBudjet", precision = 12, scale = 0)
	public Float getCriteresCahierClausesFinancieresTechniquesBudjet() {
		return this.criteresCahierClausesFinancieresTechniquesBudjet;
	}

	public void setCriteresCahierClausesFinancieresTechniquesBudjet(
			Float criteresCahierClausesFinancieresTechniquesBudjet) {
		this.criteresCahierClausesFinancieresTechniquesBudjet = criteresCahierClausesFinancieresTechniquesBudjet;
	}

	@Column(name = "criteresCahierClausesFinancieresTechniquesIdCritereAffecter")
	public Long getCriteresCahierClausesFinancieresTechniquesIdCritereAffecter() {
		return this.criteresCahierClausesFinancieresTechniquesIdCritereAffecter;
	}

	public void setCriteresCahierClausesFinancieresTechniquesIdCritereAffecter(
			Long criteresCahierClausesFinancieresTechniquesIdCritereAffecter) {
		this.criteresCahierClausesFinancieresTechniquesIdCritereAffecter = criteresCahierClausesFinancieresTechniquesIdCritereAffecter;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "criterescahierclausesfinancierestechniquestype")
	@Fetch(value = FetchMode.SUBSELECT)
	public Set<Intervallestype> getIntervallestypes() {
		return this.intervallestypes;
	}

	public void setIntervallestypes(Set<Intervallestype> intervallestypes) {
		this.intervallestypes = intervallestypes;
	}

}
