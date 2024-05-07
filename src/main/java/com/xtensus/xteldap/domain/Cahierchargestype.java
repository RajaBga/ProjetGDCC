package com.xtensus.xteldap.domain;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "cahierchargestype")
public class Cahierchargestype  implements java.io.Serializable {


	private static final long serialVersionUID = 4056232814339947855L;
	@Column(name="cahierChargesId")
    private Long cahierChargesId;
	private Categoriesprojet categoriesprojettype;
    @Column(name="cahierChargesLibelle")
	private String cahierChargesLibelle;
    @Column(name="cahierChargesDescription")
	private String cahierChargesDescription;
	private List<Cahierclausesfinancierestechniquestype> cahierclausesfinancierestechniquestypes = new ArrayList<Cahierclausesfinancierestechniquestype>(
			0);
	private List<Cahierclausesadministrativestype> cahierclausesadministrativestypes = new ArrayList<Cahierclausesadministrativestype>(
			0);

	//relations AppelOffre
	private List<AppelOffre> listeAppelOffre = new ArrayList<AppelOffre>();

	public Cahierchargestype() {
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
	public Categoriesprojet getCategoriesprojettype() {
		return this.categoriesprojettype;
	}

	public void setCategoriesprojettype(
			Categoriesprojet categoriesprojettype) {
		this.categoriesprojettype = categoriesprojettype;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierchargestype")
	@Fetch(value = FetchMode.SUBSELECT)
    //@JsonManagedReference
	public List<Cahierclausesfinancierestechniquestype> getCahierclausesfinancierestechniquestypes() {
		return this.cahierclausesfinancierestechniquestypes;
	}

	public void setCahierclausesfinancierestechniquestypes(
			List<Cahierclausesfinancierestechniquestype> cahierclausesfinancierestechniquestypes) {
		this.cahierclausesfinancierestechniquestypes = cahierclausesfinancierestechniquestypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierchargestype")
	@Fetch(value = FetchMode.SUBSELECT)
    //@JsonManagedReference
	public List<Cahierclausesadministrativestype> getCahierclausesadministrativestypes() {
		return this.cahierclausesadministrativestypes;
	}

	public void setCahierclausesadministrativestypes(
			List<Cahierclausesadministrativestype> cahierclausesadministrativestypes) {
		this.cahierclausesadministrativestypes = cahierclausesadministrativestypes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cahierChargesReference")
	 @Fetch(value = FetchMode.SUBSELECT)
	public List<AppelOffre> getListeAppelOffre() {
		return listeAppelOffre;
	}

	public void setListeAppelOffre(List<AppelOffre> listeAppelOffre) {
		this.listeAppelOffre = listeAppelOffre;
	}
    @Override
    public String toString() {
        return "Cahierchargestype{" +
            "cahierChargesId=" + cahierChargesId +
            ", categoriesprojettype=" + categoriesprojettype +
            ", cahierChargesLibelle='" + cahierChargesLibelle + '\'' +
            ", cahierChargesDescription='" + cahierChargesDescription + '\'' +
            // Exclude lists from toString()
            '}';
    }

}
