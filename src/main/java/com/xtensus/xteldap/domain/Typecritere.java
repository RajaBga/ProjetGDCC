package com.xtensus.xteldap.domain;

// Generated 6 ao�t 2013 15:04:19 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "typecritere")
public class Typecritere  implements java.io.Serializable {

	private static final long serialVersionUID = 1838637383989226761L;
	private Long typeCritereId;
	private String typeCritereLibelle;
	private String typeCritereDescription;
	private Set<Criteres> critereses = new HashSet<Criteres>(0);
	private Set<Typecahiercharges> typecahierchargeses = new HashSet<Typecahiercharges>(
			0);

	public Typecritere() {
	}

	public Typecritere(String typeCritereLibelle,
			String typeCritereDescription, Set<Criteres> critereses,
			Set<Typecahiercharges> typecahierchargeses) {
		this.typeCritereLibelle = typeCritereLibelle;
		this.typeCritereDescription = typeCritereDescription;
		this.critereses = critereses;
		this.typecahierchargeses = typecahierchargeses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "typeCritereId", unique = true, nullable = false)
	public Long getTypeCritereId() {
		return this.typeCritereId;
	}

	public void setTypeCritereId(Long typeCritereId) {
		this.typeCritereId = typeCritereId;
	}

	@Column(name = "typeCritereLibelle", length = 50)
	public String getTypeCritereLibelle() {
		return this.typeCritereLibelle;
	}

	public void setTypeCritereLibelle(String typeCritereLibelle) {
		this.typeCritereLibelle = typeCritereLibelle;
	}

	@Column(name = "typeCritereDescription", length = 65535)
	public String getTypeCritereDescription() {
		return this.typeCritereDescription;
	}

	public void setTypeCritereDescription(String typeCritereDescription) {
		this.typeCritereDescription = typeCritereDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecritere")
	public Set<Criteres> getCritereses() {
		return this.critereses;
	}

	public void setCritereses(Set<Criteres> critereses) {
		this.critereses = critereses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typecritere")
	public Set<Typecahiercharges> getTypecahierchargeses() {
		return this.typecahierchargeses;
	}

	public void setTypecahierchargeses(
			Set<Typecahiercharges> typecahierchargeses) {
		this.typecahierchargeses = typecahierchargeses;
	}

}
