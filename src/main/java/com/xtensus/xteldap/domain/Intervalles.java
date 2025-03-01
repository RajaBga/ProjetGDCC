package com.xtensus.xteldap.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "intervalles")
public class Intervalles implements java.io.Serializable {

	private static final long serialVersionUID = -497617848836301132L;
	private Long intervallesId;
	private Operateurs operateursByOperateursSuperieurId;
	private Operateurs operateursByOpeOperateursId;
	private Criterescahierclausesfinancierestechniques criterescahierclausesfinancierestechniques;
	private Float intervallesInferieur;
	private Float intervallesSuperieur;
	private Float intervallesBareme;

	public Intervalles() {
	}

	public Intervalles(
			Criterescahierclausesfinancierestechniques criterescahierclausesfinancierestechniques) {
		this.criterescahierclausesfinancierestechniques = criterescahierclausesfinancierestechniques;
	}

	public Intervalles(
			Operateurs operateursByOperateursSuperieurId,
			Operateurs operateursByOpeOperateursId,
			Criterescahierclausesfinancierestechniques criterescahierclausesfinancierestechniques,
			Float intervallesInferieur, Float intervallesSuperieur,
			Float intervallesBareme) {
		this.operateursByOperateursSuperieurId = operateursByOperateursSuperieurId;
		this.operateursByOpeOperateursId = operateursByOpeOperateursId;
		this.criterescahierclausesfinancierestechniques = criterescahierclausesfinancierestechniques;
		this.intervallesInferieur = intervallesInferieur;
		this.intervallesSuperieur = intervallesSuperieur;
		this.intervallesBareme = intervallesBareme;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "intervallesId", unique = true, nullable = false)
	public Long getIntervallesId() {
		return this.intervallesId;
	}

	public void setIntervallesId(Long intervallesId) {
		this.intervallesId = intervallesId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "operateursSuperieurId")
	public Operateurs getOperateursByOperateursSuperieurId() {
		return this.operateursByOperateursSuperieurId;
	}

	public void setOperateursByOperateursSuperieurId(
			Operateurs operateursByOperateursSuperieurId) {
		this.operateursByOperateursSuperieurId = operateursByOperateursSuperieurId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Ope_operateursId")
	public Operateurs getOperateursByOpeOperateursId() {
		return this.operateursByOpeOperateursId;
	}

	public void setOperateursByOpeOperateursId(
			Operateurs operateursByOpeOperateursId) {
		this.operateursByOpeOperateursId = operateursByOpeOperateursId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "cahierClausesFinancieresTechniquesId", referencedColumnName = "cahierClausesFinancieresTechniquesId", nullable = false),
			@JoinColumn(name = "criteresId", referencedColumnName = "criteresId", nullable = false) })
	public Criterescahierclausesfinancierestechniques getCriterescahierclausesfinancierestechniques() {
		return this.criterescahierclausesfinancierestechniques;
	}

	public void setCriterescahierclausesfinancierestechniques(
			Criterescahierclausesfinancierestechniques criterescahierclausesfinancierestechniques) {
		this.criterescahierclausesfinancierestechniques = criterescahierclausesfinancierestechniques;
	}

	@Column(name = "intervallesInferieur", precision = 12, scale = 0)
	public Float getIntervallesInferieur() {
		return this.intervallesInferieur;
	}

	public void setIntervallesInferieur(Float intervallesInferieur) {
		this.intervallesInferieur = intervallesInferieur;
	}

	@Column(name = "intervallesSuperieur", precision = 12, scale = 0)
	public Float getIntervallesSuperieur() {
		return this.intervallesSuperieur;
	}

	public void setIntervallesSuperieur(Float intervallesSuperieur) {
		this.intervallesSuperieur = intervallesSuperieur;
	}

	@Column(name = "intervallesBareme", precision = 12, scale = 0)
	public Float getIntervallesBareme() {
		return this.intervallesBareme;
	}

	public void setIntervallesBareme(Float intervallesBareme) {
		this.intervallesBareme = intervallesBareme;
	}

}
