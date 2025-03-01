package com.xtensus.xteldap.domain;


import java.util.Date;

// Generated 30 juil. 2013 11:40:13 by Hibernate Tools 3.4.0.CR1

import jakarta.persistence.*;

@Entity
@Table(name = "criterescahierclausesadministrativestype")
public class Criterescahierclausesadministrativestype implements
		java.io.Serializable {


	private static final long serialVersionUID = 5222971034165098460L;
	private CriterescahierclausesadministrativestypeId id;
	private Criterestype criterestype;
	private Cahierclausesadministrativestype cahierclausesadministrativestype;
	private Integer criteresCahierClausesAdministrativesValeur;
	private Boolean criteresCahierClausesAdministrativesElimination;
	private Long criteresCahierClausesAdministrativesIdCritereAffecter;

	public Criterescahierclausesadministrativestype() {
	}

	public Criterescahierclausesadministrativestype(
			CriterescahierclausesadministrativestypeId id,
			Criterestype criterestype,
			Cahierclausesadministrativestype cahierclausesadministrativestype) {
		this.id = id;
		this.criterestype = criterestype;
		this.cahierclausesadministrativestype = cahierclausesadministrativestype;
	}

	public Criterescahierclausesadministrativestype(
			CriterescahierclausesadministrativestypeId id,
			Criterestype criterestype,
			Cahierclausesadministrativestype cahierclausesadministrativestype,
			Integer criteresCahierClausesAdministrativesValeur,
			Boolean criteresCahierClausesAdministrativesElimination,
			Long criteresCahierClausesAdministrativesIdCritereAffecter) {
		this.id = id;
		this.criterestype = criterestype;
		this.cahierclausesadministrativestype = cahierclausesadministrativestype;
		this.criteresCahierClausesAdministrativesValeur = criteresCahierClausesAdministrativesValeur;
		this.criteresCahierClausesAdministrativesElimination = criteresCahierClausesAdministrativesElimination;
		this.criteresCahierClausesAdministrativesIdCritereAffecter = criteresCahierClausesAdministrativesIdCritereAffecter;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cahierClausesAdministrativesId", column = @Column(name = "cahierClausesAdministrativesId", nullable = false)),
			@AttributeOverride(name = "criteresId", column = @Column(name = "criteresId", nullable = false)) })
	public CriterescahierclausesadministrativestypeId getId() {
		return this.id;
	}

	public void setId(CriterescahierclausesadministrativestypeId id) {
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
	@JoinColumn(name = "cahierClausesAdministrativesId", nullable = false, insertable = false, updatable = false)
	public Cahierclausesadministrativestype getCahierclausesadministrativestype() {
		return this.cahierclausesadministrativestype;
	}

	public void setCahierclausesadministrativestype(
			Cahierclausesadministrativestype cahierclausesadministrativestype) {
		this.cahierclausesadministrativestype = cahierclausesadministrativestype;
	}

	@Column(name = "criteresCahierClausesAdministrativesValeur")
	public Integer getCriteresCahierClausesAdministrativesValeur() {
		return this.criteresCahierClausesAdministrativesValeur;
	}

	public void setCriteresCahierClausesAdministrativesValeur(
			Integer criteresCahierClausesAdministrativesValeur) {
		this.criteresCahierClausesAdministrativesValeur = criteresCahierClausesAdministrativesValeur;
	}

	@Column(name = "criteresCahierClausesAdministrativesElimination")
	public Boolean getCriteresCahierClausesAdministrativesElimination() {
		return this.criteresCahierClausesAdministrativesElimination;
	}

	public void setCriteresCahierClausesAdministrativesElimination(
			Boolean criteresCahierClausesAdministrativesElimination) {
		this.criteresCahierClausesAdministrativesElimination = criteresCahierClausesAdministrativesElimination;
	}

	@Column(name = "criteresCahierClausesAdministrativesIdCritereAffecter")
	public Long getCriteresCahierClausesAdministrativesIdCritereAffecter() {
		return this.criteresCahierClausesAdministrativesIdCritereAffecter;
	}

	public void setCriteresCahierClausesAdministrativesIdCritereAffecter(
			Long criteresCahierClausesAdministrativesIdCritereAffecter) {
		this.criteresCahierClausesAdministrativesIdCritereAffecter = criteresCahierClausesAdministrativesIdCritereAffecter;
	}
}
