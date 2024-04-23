package com.xtensus.xteldap.domain;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;



@Entity
@Table(name = "soumission")
public class Soumission extends Entite implements Serializable {


	private static final long serialVersionUID = -5301398229272896057L;



	private Long   soumissionReference ;
	private Long   soumissionMoyenneFinanciere ;
	private Float  soumissionMoyennePonderee ;
	private String soumissionEtatDepouillementAdministratif ;
	private String soumissionEtatDepouillementFinanciere ;
	private String soumissionEtatDepouillementTechnique ;
	private String soumissionEtatGlobal ;






	//relations
	//private Cahierclausesadministrativestype cahierClausesAdministrativesReference ;
	//private Cahiercharges cahierChargesReference ;
	private List<AppelOffre> soumissionListeAppelOffreAssociees = new ArrayList<AppelOffre>();




	public void AjouterAppelOffre(AppelOffre a){
		a.getAppelOffreListeSoumissionsAssocies().add(this);
		this.soumissionListeAppelOffreAssociees.add(a);
	}


	private Soumissionnaire soumissionnaireReference=new Soumissionnaire() ;












	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "soumissionReference", unique = true, nullable = false)
	public Long getSoumissionReference() {
		return soumissionReference;
	}
	/**
	 * @param soumissionReference the soumissionReference to set
	 */
	public void setSoumissionReference(Long soumissionReference) {
		this.soumissionReference = soumissionReference;
	}
	/**
	 * @return the soumissionMoyenneFinanciere
	 */
	public Long getSoumissionMoyenneFinanciere() {
		return soumissionMoyenneFinanciere;
	}
	/**
	 * @param soumissionMoyenneFinanciere the soumissionMoyenneFinanciere to set
	 */
	public void setSoumissionMoyenneFinanciere(Long soumissionMoyenneFinanciere) {
		this.soumissionMoyenneFinanciere = soumissionMoyenneFinanciere;
	}
	/**
	 * @return the soumissionMoyennePonderee
	 */
	public Float getSoumissionMoyennePonderee() {
		return soumissionMoyennePonderee;
	}
	/**
	 * @param soumissionMoyennePonderee the soumissionMoyennePonderee to set
	 */
	public void setSoumissionMoyennePonderee(Float soumissionMoyennePonderee) {
		this.soumissionMoyennePonderee = soumissionMoyennePonderee;
	}
	/**
	 * @return the soumissionEtatDepouillementAdministratif
	 */
	public String getSoumissionEtatDepouillementAdministratif() {
		return soumissionEtatDepouillementAdministratif;
	}
	/**
	 * @param soumissionEtatDepouillementAdministratif the soumissionEtatDepouillementAdministratif to set
	 */
	public void setSoumissionEtatDepouillementAdministratif(
			String soumissionEtatDepouillementAdministratif) {
		this.soumissionEtatDepouillementAdministratif = soumissionEtatDepouillementAdministratif;
	}
	/**
	 * @return the soumissionEtatDepouillementFinanciere
	 */
	public String getSoumissionEtatDepouillementFinanciere() {
		return soumissionEtatDepouillementFinanciere;
	}
	/**
	 * @param soumissionEtatDepouillementFinanciere the soumissionEtatDepouillementFinanciere to set
	 */
	public void setSoumissionEtatDepouillementFinanciere(
			String soumissionEtatDepouillementFinanciere) {
		this.soumissionEtatDepouillementFinanciere = soumissionEtatDepouillementFinanciere;
	}
	/**
	 * @return the soumissionEtatDepouillementTechnique
	 */
	public String getSoumissionEtatDepouillementTechnique() {
		return soumissionEtatDepouillementTechnique;
	}
	/**
	 * @param soumissionEtatDepouillementTechnique the soumissionEtatDepouillementTechnique to set
	 */
	public void setSoumissionEtatDepouillementTechnique(
			String soumissionEtatDepouillementTechnique) {
		this.soumissionEtatDepouillementTechnique = soumissionEtatDepouillementTechnique;
	}
	/**
	 * @return the soumissionEtatGlobal
	 */
	public String getSoumissionEtatGlobal() {
		return soumissionEtatGlobal;
	}
	/**
	 * @param soumissionEtatGlobal the soumissionEtatGlobal to set
	 */
	public void setSoumissionEtatGlobal(String soumissionEtatGlobal) {
		this.soumissionEtatGlobal = soumissionEtatGlobal;
	}











	@ManyToMany( cascade ={CascadeType.PERSIST, CascadeType.MERGE},
			fetch = FetchType.EAGER ,mappedBy="appelOffreListeSoumissionsAssocies")
	@Fetch(value = FetchMode.SUBSELECT)
	public List<AppelOffre> getSoumissionListeAppelOffreAssociees() {
		return soumissionListeAppelOffreAssociees;
	}

	public void setSoumissionListeAppelOffreAssociees(
			List<AppelOffre> soumissionListeAppelOffreAssociees) {
		this.soumissionListeAppelOffreAssociees = soumissionListeAppelOffreAssociees;
	}







	@ManyToOne
	@JoinColumn( name="soumissionnaireReference", referencedColumnName="soumissionnaireReference" )
	public Soumissionnaire getSoumissionnaireReference() {
		return soumissionnaireReference;
	}
	/**
	 * @param soumissionnaireReference the soumissionnaireReference to set
	 */
	public void setSoumissionnaireReference(Soumissionnaire soumissionnaireReference) {
		this.soumissionnaireReference = soumissionnaireReference;
	}




















}
