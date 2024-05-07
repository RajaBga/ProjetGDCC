package com.xtensus.xteldap.domain;

// Generated 6 ao�t 2013 15:04:19 by Hibernate Tools 3.4.0.CR1

import jakarta.persistence.*;


@Entity
@Table(name = "criterescategoriesprojet")
public class Criterescategoriesprojet  implements java.io.Serializable {

	private static final long serialVersionUID = 1994680278691380085L;
	private CriterescategoriesprojetId id;
	private Criteres criteres;
	private Categoriesprojet categoriesprojet;

	public Criterescategoriesprojet() {
	}

	public Criterescategoriesprojet(CriterescategoriesprojetId id,
			Criteres criteres, Categoriesprojet categoriesprojet) {
		this.id = id;
		this.criteres = criteres;
		this.categoriesprojet = categoriesprojet;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "criteresId", column = @Column(name = "criteresId", nullable = false)),
			@AttributeOverride(name = "categoriesProjetId", column = @Column(name = "categoriesProjetId", nullable = false)) })
	public CriterescategoriesprojetId getId() {
		return this.id;
	}

	public void setId(CriterescategoriesprojetId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "criteresId", nullable = false, insertable = false, updatable = false)
	public Criteres getCriteres() {
		return this.criteres;
	}

	public void setCriteres(Criteres criteres) {
		this.criteres = criteres;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoriesProjetId", nullable = false, insertable = false, updatable = false)
	public Categoriesprojet getCategoriesprojet() {
		return this.categoriesprojet;
	}

	public void setCategoriesprojet(Categoriesprojet categoriesprojet) {
		this.categoriesprojet = categoriesprojet;
	}

}
