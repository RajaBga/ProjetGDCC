package com.xtensus.xteldap.domain;


import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;


@Entity
@Table(name = "operateurs")
public class Operateurs   implements java.io.Serializable {

	private static final long serialVersionUID = -746082728970331105L;
	private Integer operateursId;
	private String operateursSymbole;
	private String operateursDescription;
	private Set<Intervalles> intervallesesForOpeOperateursId = new HashSet<Intervalles>(
			0);
	private Set<Intervalles> intervallesesForOperateursSuperieurId = new HashSet<Intervalles>(
			0);

	public Operateurs() {
	}

	public Operateurs(String operateursSymbole, String operateursDescription,
			Set<Intervalles> intervallesesForOpeOperateursId,
			Set<Intervalles> intervallesesForOperateursSuperieurId) {
		this.operateursSymbole = operateursSymbole;
		this.operateursDescription = operateursDescription;
		this.intervallesesForOpeOperateursId = intervallesesForOpeOperateursId;
		this.intervallesesForOperateursSuperieurId = intervallesesForOperateursSuperieurId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "operateursId", unique = true, nullable = false)
	public Integer getOperateursId() {
		return this.operateursId;
	}

	public void setOperateursId(Integer operateursId) {
		this.operateursId = operateursId;
	}

	@Column(name = "operateursSymbole", length = 10)
	public String getOperateursSymbole() {
		return this.operateursSymbole;
	}

	public void setOperateursSymbole(String operateursSymbole) {
		this.operateursSymbole = operateursSymbole;
	}

	@Column(name = "operateursDescription", length = 65535)
	public String getOperateursDescription() {
		return this.operateursDescription;
	}

	public void setOperateursDescription(String operateursDescription) {
		this.operateursDescription = operateursDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "operateursByOpeOperateursId")
	public Set<Intervalles> getIntervallesesForOpeOperateursId() {
		return this.intervallesesForOpeOperateursId;
	}

	public void setIntervallesesForOpeOperateursId(
			Set<Intervalles> intervallesesForOpeOperateursId) {
		this.intervallesesForOpeOperateursId = intervallesesForOpeOperateursId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "operateursByOperateursSuperieurId")
	public Set<Intervalles> getIntervallesesForOperateursSuperieurId() {
		return this.intervallesesForOperateursSuperieurId;
	}

	public void setIntervallesesForOperateursSuperieurId(
			Set<Intervalles> intervallesesForOperateursSuperieurId) {
		this.intervallesesForOperateursSuperieurId = intervallesesForOperateursSuperieurId;
	}

}
