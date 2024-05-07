package com.xtensus.xteldap.domain;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "appeloffres")
public class AppelOffre  implements Serializable {


	private static final long serialVersionUID = 1L;

	@Column(name="appelOffreReference")
	private Long    appelOffreReference ;
    @Column(name="appelOffreCode ")
	private String  appelOffreCode ;
    @Column(name="appelOffreIntitule")
	private String  appelOffreIntitule ;
    @Column(name="appelOffreObjet")
	private String  appelOffreObjet ;
    @Column(name="appelOffreDatePublication")
	private Date    appelOffreDatePublication ;
    @Column(name="appelOffreDateLimiteRemise")
	private Date    appelOffreDateLimiteRemise ;
    @Column(name="appelOffreDateLimiteRetrait")
	private Date    appelOffreDateLimiteRetrait ;
    @Column(name="appelOffreSeanceOuverturePlis")
	private Date    appelOffreDateSeanceOuverturePlis ;
    @Column(name="appelOffreCoutEstime")
	private Float   appelOffreCoutEstime ;
    @Column(name="appelOffreNbrLots")
	private Integer appelOffreNbrLots ;

	private Integer appelOffreEtatPrincipale ;

	private Cahierchargestype cahierChargesReference = new Cahierchargestype();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appelOffreReference", unique = true, nullable = false)
	public Long getAppelOffreReference() {
		return appelOffreReference;
	}

	public void setAppelOffreReference(Long appelOffreReference) {
		this.appelOffreReference = appelOffreReference;
	}

	public String getAppelOffreCode() {
		return appelOffreCode;
	}

	public void setAppelOffreCode(String appelOffreCode) {
		this.appelOffreCode = appelOffreCode;
	}

	public String getAppelOffreIntitule() {
		return appelOffreIntitule;
	}

	public void setAppelOffreIntitule(String appelOffreIntitule) {
		this.appelOffreIntitule = appelOffreIntitule;
	}

	public String getAppelOffreObjet() {
		return appelOffreObjet;
	}

	public void setAppelOffreObjet(String appelOffreObjet) {
		this.appelOffreObjet = appelOffreObjet;
	}

	public Date getAppelOffreDatePublication() {
		return appelOffreDatePublication;
	}

	public void setAppelOffreDatePublication(Date appelOffreDatePublication) {
		this.appelOffreDatePublication = appelOffreDatePublication;
	}

	@Temporal(TemporalType.DATE)
	public Date getAppelOffreDateLimiteRemise() {
		return appelOffreDateLimiteRemise;

		}

	public void setAppelOffreDateLimiteRemise(Date appelOffreDateLimiteRemise) {
		this.appelOffreDateLimiteRemise = appelOffreDateLimiteRemise;
	}

	public Date getAppelOffreDateLimiteRetrait() {
		return appelOffreDateLimiteRetrait;
	}

	public void setAppelOffreDateLimiteRetrait(Date appelOffreDateLimiteRetrait) {
		this.appelOffreDateLimiteRetrait = appelOffreDateLimiteRetrait;
	}

	public Date getAppelOffreDateSeanceOuverturePlis() {
		return appelOffreDateSeanceOuverturePlis;
	}

	public void setAppelOffreDateSeanceOuverturePlis(
			Date appelOffreDateSeanceOuverturePlis) {
		this.appelOffreDateSeanceOuverturePlis = appelOffreDateSeanceOuverturePlis;
	}

	public Float getAppelOffreCoutEstime() {
		return appelOffreCoutEstime;
	}

	public void setAppelOffreCoutEstime(Float appelOffreCoutEstime) {
		this.appelOffreCoutEstime = appelOffreCoutEstime;
	}

	public Integer getAppelOffreNbrLots() {
		return appelOffreNbrLots;
	}

	public void setAppelOffreNbrLots(Integer appelOffreNbrLots) {
		this.appelOffreNbrLots = appelOffreNbrLots;
	}

	public Integer getAppelOffreEtatPrincipale() {
		return appelOffreEtatPrincipale;
	}

	public void setAppelOffreEtatPrincipale(Integer appelOffreEtatPrincipale) {
		this.appelOffreEtatPrincipale = appelOffreEtatPrincipale;
	}

	//relations

	@ManyToOne(fetch = FetchType.EAGER ,cascade={CascadeType.MERGE})
	@JoinColumn(name = "cahierChargesReference")
	public Cahierchargestype getCahierChargesReference() {
		return cahierChargesReference;
	}


	public void setCahierChargesReference(Cahierchargestype cahierChargesReference) {
		this.cahierChargesReference = cahierChargesReference;
	}

}
