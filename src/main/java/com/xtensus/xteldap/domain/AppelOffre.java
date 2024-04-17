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
public class AppelOffre extends Entite implements Serializable {

	/**
	 *
	 */
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



	private List<Soumission> appelOffreListeSoumissionsAssocies =new ArrayList<Soumission>(); ;
	private Cahierchargestype cahierChargesReference = new Cahierchargestype();
















	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "appelOffreReference", unique = true, nullable = false)
	public Long getAppelOffreReference() {
		return appelOffreReference;
	}

	/**
	 * @param appelOffreReference the appelOffreReference to set
	 */
	public void setAppelOffreReference(Long appelOffreReference) {
		this.appelOffreReference = appelOffreReference;
	}

	/**
	 * @return the appelOffreCode
	 */
	public String getAppelOffreCode() {
		return appelOffreCode;
	}

	/**
	 * @param appelOffreCode the appelOffreCode to set
	 */
	public void setAppelOffreCode(String appelOffreCode) {
		this.appelOffreCode = appelOffreCode;
	}

	/**
	 * @return the appelOffreIntitule
	 */
	public String getAppelOffreIntitule() {
		return appelOffreIntitule;
	}

	/**
	 * @param appelOffreIntitule the appelOffreIntitule to set
	 */
	public void setAppelOffreIntitule(String appelOffreIntitule) {
		this.appelOffreIntitule = appelOffreIntitule;
	}

	/**
	 * @return the appelOffreObjet
	 */
	public String getAppelOffreObjet() {
		return appelOffreObjet;
	}

	/**
	 * @param appelOffreObjet the appelOffreObjet to set
	 */
	public void setAppelOffreObjet(String appelOffreObjet) {
		this.appelOffreObjet = appelOffreObjet;
	}

	/**
	 * @return the appelOffreDatePublication
	 */
	public Date getAppelOffreDatePublication() {
		return appelOffreDatePublication;
	}

	/**
	 * @param appelOffreDatePublication the appelOffreDatePublication to set
	 */
	public void setAppelOffreDatePublication(Date appelOffreDatePublication) {
		this.appelOffreDatePublication = appelOffreDatePublication;
	}

	/**
	 * @return the appelOffreDateLimiteRemise
	 */
	@Temporal(TemporalType.DATE)
	public Date getAppelOffreDateLimiteRemise() {
		return appelOffreDateLimiteRemise;

		}

	/**
	 * @param appelOffreDateLimiteRemise the appelOffreDateLimiteRemise to set
	 */

	public void setAppelOffreDateLimiteRemise(Date appelOffreDateLimiteRemise) {
		this.appelOffreDateLimiteRemise = appelOffreDateLimiteRemise;
	}

	/**
	 * @return the appelOffreDateLimiteRetrait
	 */
	public Date getAppelOffreDateLimiteRetrait() {
		return appelOffreDateLimiteRetrait;
	}

	/**
	 * @param appelOffreDateLimiteRetrait the appelOffreDateLimiteRetrait to set
	 */
	public void setAppelOffreDateLimiteRetrait(Date appelOffreDateLimiteRetrait) {
		this.appelOffreDateLimiteRetrait = appelOffreDateLimiteRetrait;
	}

	/**
	 * @return the appelOffreDateSeanceOuverturePlis
	 */
	public Date getAppelOffreDateSeanceOuverturePlis() {
		return appelOffreDateSeanceOuverturePlis;
	}

	/**
	 * @param appelOffreDateSeanceOuverturePlis the appelOffreDateSeanceOuverturePlis to set
	 */
	public void setAppelOffreDateSeanceOuverturePlis(
			Date appelOffreDateSeanceOuverturePlis) {
		this.appelOffreDateSeanceOuverturePlis = appelOffreDateSeanceOuverturePlis;
	}

	/**
	 * @return the appelOffreCoutEstime
	 */
	public Float getAppelOffreCoutEstime() {
		return appelOffreCoutEstime;
	}

	/**
	 * @param appelOffreCoutEstime the appelOffreCoutEstime to set
	 */
	public void setAppelOffreCoutEstime(Float appelOffreCoutEstime) {
		this.appelOffreCoutEstime = appelOffreCoutEstime;
	}

	/**
	 * @return the appelOffreNbrLots
	 */
	public Integer getAppelOffreNbrLots() {
		return appelOffreNbrLots;
	}

	/**
	 * @param appelOffreNbrLots the appelOffreNbrLots to set
	 */
	public void setAppelOffreNbrLots(Integer appelOffreNbrLots) {
		this.appelOffreNbrLots = appelOffreNbrLots;
	}

	/**
	 * @return the appelOffreEtatPrincipale
	 */
	public Integer getAppelOffreEtatPrincipale() {
		return appelOffreEtatPrincipale;
	}

	/**
	 * @param appelOffreEtatPrincipale the appelOffreEtatPrincipale to set
	 */
	public void setAppelOffreEtatPrincipale(Integer appelOffreEtatPrincipale) {
		this.appelOffreEtatPrincipale = appelOffreEtatPrincipale;
	}










	//relations



	@ManyToMany(
			fetch= FetchType.EAGER)

	  @JoinTable(name = "appeloffresoumissionnaire",
        joinColumns = { @JoinColumn(name = "appelOffreReference",referencedColumnName = "appelOffreReference", nullable = false) },
        inverseJoinColumns = { @JoinColumn(name = "soumissionReference",referencedColumnName = "soumissionReference", nullable = false)
			  })

		@Fetch(value = FetchMode.SUBSELECT)
	public List<Soumission> getAppelOffreListeSoumissionsAssocies() {
		return appelOffreListeSoumissionsAssocies;
	}

	/**
	 * @param appelOffreListeSoumissionsAssocies the appelOffreListeSoumissionsAssocies to set
	 */
	public void setAppelOffreListeSoumissionsAssocies(
			List<Soumission> appelOffreListeSoumissionsAssocies) {
		this.appelOffreListeSoumissionsAssocies = appelOffreListeSoumissionsAssocies;
	}








	@ManyToOne(fetch = FetchType.EAGER ,cascade={CascadeType.MERGE})
	@JoinColumn(name = "cahierChargesReference")
	public Cahierchargestype getCahierChargesReference() {
		return cahierChargesReference;
	}

	/**
	 * @param cahierChargesReference the cahierChargesReference to set
	 */
	public void setCahierChargesReference(Cahierchargestype cahierChargesReference) {
		this.cahierChargesReference = cahierChargesReference;
	}

























}
