package com.xtensus.xteldap.domain;

import java.util.Date;

// Generated 31 juil. 2013 13:29:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "cahierclausesadministrativestype")
public class Cahierclausesadministrativestype  implements java.io.Serializable {


	private static final long serialVersionUID = 5039108129010838657L;
	private Long cahierClausesAdministrativesId;
	private Categoriesprojet categoriesprojettype;
	private Typecahiercharges typecahierchargestype;
	private Cahierchargestype cahierchargestype;
	private String cahierClausesAdministrativesLibelle;
	private String cahierClausesAdministrativeDescription;
	private Date CahierClauseAdministrativeDateCration;
	private Set<Criterescahierclausesadministrativestype> criterescahierclausesadministrativestypes = new HashSet<Criterescahierclausesadministrativestype>(
			0);

	public Cahierclausesadministrativestype() {
	}

	public Cahierclausesadministrativestype(Cahierchargestype cahierchargestype) {
		this.cahierchargestype = cahierchargestype;
	}

	public Cahierclausesadministrativestype(
			Categoriesprojet categoriesprojettype,
			Typecahiercharges typecahierchargestype,
			Cahierchargestype cahierchargestype,
			String cahierClausesAdministrativesLibelle,
			String cahierClausesAdministrativeDescription,
			Set<Criterescahierclausesadministrativestype> criterescahierclausesadministrativestypes) {
		this.categoriesprojettype = categoriesprojettype;
		this.typecahierchargestype = typecahierchargestype;
		this.cahierchargestype = cahierchargestype;
		this.cahierClausesAdministrativesLibelle = cahierClausesAdministrativesLibelle;
		this.cahierClausesAdministrativeDescription = cahierClausesAdministrativeDescription;
		this.criterescahierclausesadministrativestypes = criterescahierclausesadministrativestypes;
	}

	@Id

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
	public Categoriesprojet getCategoriesprojettype() {
		return this.categoriesprojettype;
	}

	public void setCategoriesprojettype(
			Categoriesprojet categoriesprojettype) {
		this.categoriesprojettype = categoriesprojettype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeCahierDesChargesId")

	public Typecahiercharges getTypecahierchargestype() {
		return this.typecahierchargestype;
	}

	public void setTypecahierchargestype(
			Typecahiercharges typecahierchargestype) {
		this.typecahierchargestype = typecahierchargestype;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cahierChargesId")
    @JsonIgnore
	public Cahierchargestype getCahierchargestype() {
		return this.cahierchargestype;
	}

	public void setCahierchargestype(Cahierchargestype cahierchargestype) {
		this.cahierchargestype = cahierchargestype;
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

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "cahierclausesadministrativestype")
	@Fetch(value = FetchMode.SUBSELECT)
	public Set<Criterescahierclausesadministrativestype> getCriterescahierclausesadministrativestypes() {
		return this.criterescahierclausesadministrativestypes;
	}

	public void setCriterescahierclausesadministrativestypes(
			Set<Criterescahierclausesadministrativestype> criterescahierclausesadministrativestypes) {
		this.criterescahierclausesadministrativestypes = criterescahierclausesadministrativestypes;
	}
	@Column(name = "CahierClauseAdministrativeDateCration", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getCahierClauseAdministrativeDateCration() {
		return CahierClauseAdministrativeDateCration;
	}

	public void setCahierClauseAdministrativeDateCration(Date cahierClauseAdministrativeDateCration) {
		CahierClauseAdministrativeDateCration = cahierClauseAdministrativeDateCration;
	}

}
