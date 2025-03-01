package com.xtensus.xteldap.domain;


import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "cahiercharges")
public class Cahiercharges  implements java.io.Serializable {


	private static final long serialVersionUID = 6630840835358775645L;
	@Column(name="cahierChargesId")
    private Long cahierChargesId;
	private Categoriesprojet categoriesprojet;
    @Column(name="cahierChargesLibelle")
	private String cahierChargesLibelle;
    @Column(name="cahierChargesDescription")
	private String cahierChargesDescription;
	private Set<Cahierclausesfinancierestechniques> cahierclausesfinancierestechniqueses = new HashSet<Cahierclausesfinancierestechniques>(
			0);
	private Set<Cahierclausesadministratives> cahierclausesadministrativeses = new HashSet<Cahierclausesadministratives>(
			0);


	public Cahiercharges() {
	}

	public Cahiercharges(
			Categoriesprojet categoriesprojet,
			String cahierChargesLibelle,
			String cahierChargesDescription,
			Set<Cahierclausesfinancierestechniques> cahierclausesfinancierestechniqueses,
			Set<Cahierclausesadministratives> cahierclausesadministrativeses) {
		this.categoriesprojet = categoriesprojet;
		this.cahierChargesLibelle = cahierChargesLibelle;
		this.cahierChargesDescription = cahierChargesDescription;
		this.cahierclausesfinancierestechniqueses = cahierclausesfinancierestechniqueses;
		this.cahierclausesadministrativeses = cahierclausesadministrativeses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cahierChargesId", unique = true, nullable = false)
	public Long getCahierChargesId() {
		return this.cahierChargesId;
	}

	public void setCahierChargesId(Long cahierChargesId) {
		this.cahierChargesId = cahierChargesId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categoriesProjetId")

	public Categoriesprojet getCategoriesprojet() {
		return this.categoriesprojet;
	}

	public void setCategoriesprojet(Categoriesprojet categoriesprojet) {
		this.categoriesprojet = categoriesprojet;
	}

	@Column(name = "cahierChargesLibelle", length = 100)
	public String getCahierChargesLibelle() {
		return this.cahierChargesLibelle;
	}

	public void setCahierChargesLibelle(String cahierChargesLibelle) {
		this.cahierChargesLibelle = cahierChargesLibelle;
	}

	@Column(name = "cahierChargesDescription", length = 65535)
	public String getCahierChargesDescription() {
		return this.cahierChargesDescription;
	}

	public void setCahierChargesDescription(String cahierChargesDescription) {
		this.cahierChargesDescription = cahierChargesDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahiercharges")
	@Fetch(value = FetchMode.SUBSELECT)
	public Set<Cahierclausesfinancierestechniques> getCahierclausesfinancierestechniqueses() {
		return this.cahierclausesfinancierestechniqueses;
	}

	public void setCahierclausesfinancierestechniqueses(
			Set<Cahierclausesfinancierestechniques> cahierclausesfinancierestechniqueses) {
		this.cahierclausesfinancierestechniqueses = cahierclausesfinancierestechniqueses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahiercharges")
	@Fetch(value = FetchMode.SUBSELECT)
	public Set<Cahierclausesadministratives> getCahierclausesadministrativeses() {
		return this.cahierclausesadministrativeses;
	}

	public void setCahierclausesadministrativeses(
			Set<Cahierclausesadministratives> cahierclausesadministrativeses) {
		this.cahierclausesadministrativeses = cahierclausesadministrativeses;
	}

}
