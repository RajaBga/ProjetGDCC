package com.xtensus.xteldap.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "soumissionnaire")
public class Soumissionnaire extends Entite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	private Long   soumissionnaireReference ; 
	private String soumissionnaireRaisonSociale ; 
	private Float  soumissionnaireCapital ; 
	private String soumissionnaireMatriculeFiscal ; 
	private String soumissionnaireAdresseSiegeSocial ; 
	private String soumissionnaireAffiliationCNSS ; 
	private String soumissionnaireNumeroRIB ; 
	private String soumissionnaireLieuOuvertureCompte ;
	
	private Date   soumissionnaireAnneeCreation ;
	private String soumissionnaireIdentifiant ;
	private String soumissionnaireNom ; 
	private String soumissionnairePrenom ; 
	private Date   soumissionnaireDateFiche ; 
	
	//soumissionnaireEtatDossierId
	
	private String  soumissionnaireNationalite ; 
	private String  soumissionnaireNumeroRegistreCommerce ; 
	private String  soumissionnaireAutreAdresse ; 
	private Double  soumissionnaireMoyenEvaluation ; 
	private Integer soumissionnaireNombreMarchesGagnees ; 
	private Integer soumissionnaireNombreMarchesEvaluees ; 
	private Integer soumissionnaireNombreMarchesNonEvaluees ; 
	private Double  soumissionnaireNoteGlobale ;
	
	
	
	
	
	
	
	
	
	
	
	//relations soummissions 
	private List<Soumission> soumissionnaireListeSoumissions = new ArrayList<Soumission>(); 
	
	
	public void AjouterSoumission(Soumission s){
		s.setSoumissionnaireReference(this);
		this.soumissionnaireListeSoumissions.add(s);
	}
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "soumissionnaireReference", unique = true, nullable = false)
	public Long getSoumissionnaireReference() {
		return soumissionnaireReference;
	}
	/**
	 * @param soumissionnaireReference the soumissionnaireReference to set
	 */
	public void setSoumissionnaireReference(Long soumissionnaireReference) {
		this.soumissionnaireReference = soumissionnaireReference;
	}
	/**
	 * @return the soumissionnaireRaisonSociale
	 */
	public String getSoumissionnaireRaisonSociale() {
		return soumissionnaireRaisonSociale;
	}
	/**
	 * @param soumissionnaireRaisonSociale the soumissionnaireRaisonSociale to set
	 */
	public void setSoumissionnaireRaisonSociale(String soumissionnaireRaisonSociale) {
		this.soumissionnaireRaisonSociale = soumissionnaireRaisonSociale;
	}
	/**
	 * @return the soumissionnaireCapital
	 */
	public Float getSoumissionnaireCapital() {
		return soumissionnaireCapital;
	}
	/**
	 * @param soumissionnaireCapital the soumissionnaireCapital to set
	 */
	public void setSoumissionnaireCapital(Float soumissionnaireCapital) {
		this.soumissionnaireCapital = soumissionnaireCapital;
	}
	/**
	 * @return the soumissionnaireMatriculeFiscal
	 */
	public String getSoumissionnaireMatriculeFiscal() {
		return soumissionnaireMatriculeFiscal;
	}
	/**
	 * @param soumissionnaireMatriculeFiscal the soumissionnaireMatriculeFiscal to set
	 */
	public void setSoumissionnaireMatriculeFiscal(
			String soumissionnaireMatriculeFiscal) {
		this.soumissionnaireMatriculeFiscal = soumissionnaireMatriculeFiscal;
	}
	/**
	 * @return the soumissionnaireAdresseSiegeSocial
	 */
	public String getSoumissionnaireAdresseSiegeSocial() {
		return soumissionnaireAdresseSiegeSocial;
	}
	/**
	 * @param soumissionnaireAdresseSiegeSocial the soumissionnaireAdresseSiegeSocial to set
	 */
	public void setSoumissionnaireAdresseSiegeSocial(
			String soumissionnaireAdresseSiegeSocial) {
		this.soumissionnaireAdresseSiegeSocial = soumissionnaireAdresseSiegeSocial;
	}
	/**
	 * @return the soumissionnaireAffiliationCNSS
	 */
	public String getSoumissionnaireAffiliationCNSS() {
		return soumissionnaireAffiliationCNSS;
	}
	/**
	 * @param soumissionnaireAffiliationCNSS the soumissionnaireAffiliationCNSS to set
	 */
	public void setSoumissionnaireAffiliationCNSS(
			String soumissionnaireAffiliationCNSS) {
		this.soumissionnaireAffiliationCNSS = soumissionnaireAffiliationCNSS;
	}
	/**
	 * @return the soumissionnaireNumeroRIB
	 */
	public String getSoumissionnaireNumeroRIB() {
		return soumissionnaireNumeroRIB;
	}
	/**
	 * @param soumissionnaireNumeroRIB the soumissionnaireNumeroRIB to set
	 */
	public void setSoumissionnaireNumeroRIB(String soumissionnaireNumeroRIB) {
		this.soumissionnaireNumeroRIB = soumissionnaireNumeroRIB;
	}
	/**
	 * @return the soumissionnaireLieuOuvertureCompte
	 */
	public String getSoumissionnaireLieuOuvertureCompte() {
		return soumissionnaireLieuOuvertureCompte;
	}
	/**
	 * @param soumissionnaireLieuOuvertureCompte the soumissionnaireLieuOuvertureCompte to set
	 */
	public void setSoumissionnaireLieuOuvertureCompte(
			String soumissionnaireLieuOuvertureCompte) {
		this.soumissionnaireLieuOuvertureCompte = soumissionnaireLieuOuvertureCompte;
	}
	/**
	 * @return the soumissionnaireAnneeCreation
	 */
	public Date getSoumissionnaireAnneeCreation() {
		return soumissionnaireAnneeCreation;
	}
	/**
	 * @param soumissionnaireAnneeCreation the soumissionnaireAnneeCreation to set
	 */
	public void setSoumissionnaireAnneeCreation(Date soumissionnaireAnneeCreation) {
		this.soumissionnaireAnneeCreation = soumissionnaireAnneeCreation;
	}
	/**
	 * @return the soumissionnaireIdentifiant
	 */
	public String getSoumissionnaireIdentifiant() {
		return soumissionnaireIdentifiant;
	}
	/**
	 * @param soumissionnaireIdentifiant the soumissionnaireIdentifiant to set
	 */
	public void setSoumissionnaireIdentifiant(String soumissionnaireIdentifiant) {
		this.soumissionnaireIdentifiant = soumissionnaireIdentifiant;
	}
	/**
	 * @return the soumissionnaireNom
	 */
	public String getSoumissionnaireNom() {
		return soumissionnaireNom;
	}
	/**
	 * @param soumissionnaireNom the soumissionnaireNom to set
	 */
	public void setSoumissionnaireNom(String soumissionnaireNom) {
		this.soumissionnaireNom = soumissionnaireNom;
	}
	/**
	 * @return the soumissionnairePrenom
	 */
	public String getSoumissionnairePrenom() {
		return soumissionnairePrenom;
	}
	/**
	 * @param soumissionnairePrenom the soumissionnairePrenom to set
	 */
	public void setSoumissionnairePrenom(String soumissionnairePrenom) {
		this.soumissionnairePrenom = soumissionnairePrenom;
	}
	/**
	 * @return the soumissionnaireDateFiche
	 */
	public Date getSoumissionnaireDateFiche() {
		return soumissionnaireDateFiche;
	}
	/**
	 * @param soumissionnaireDateFiche the soumissionnaireDateFiche to set
	 */
	public void setSoumissionnaireDateFiche(Date soumissionnaireDateFiche) {
		this.soumissionnaireDateFiche = soumissionnaireDateFiche;
	}
	/**
	 * @return the soumissionnaireNationalite
	 */
	public String getSoumissionnaireNationalite() {
		return soumissionnaireNationalite;
	}
	/**
	 * @param soumissionnaireNationalite the soumissionnaireNationalite to set
	 */
	public void setSoumissionnaireNationalite(String soumissionnaireNationalite) {
		this.soumissionnaireNationalite = soumissionnaireNationalite;
	}
	/**
	 * @return the soumissionnaireNumeroRegistreCommerce
	 */
	public String getSoumissionnaireNumeroRegistreCommerce() {
		return soumissionnaireNumeroRegistreCommerce;
	}
	/**
	 * @param soumissionnaireNumeroRegistreCommerce the soumissionnaireNumeroRegistreCommerce to set
	 */
	public void setSoumissionnaireNumeroRegistreCommerce(
			String soumissionnaireNumeroRegistreCommerce) {
		this.soumissionnaireNumeroRegistreCommerce = soumissionnaireNumeroRegistreCommerce;
	}
	/**
	 * @return the soumissionnaireAutreAdresse
	 */
	public String getSoumissionnaireAutreAdresse() {
		return soumissionnaireAutreAdresse;
	}
	/**
	 * @param soumissionnaireAutreAdresse the soumissionnaireAutreAdresse to set
	 */
	public void setSoumissionnaireAutreAdresse(String soumissionnaireAutreAdresse) {
		this.soumissionnaireAutreAdresse = soumissionnaireAutreAdresse;
	}
	/**
	 * @return the soumissionnaireMoyenEvaluation
	 */
	public Double getSoumissionnaireMoyenEvaluation() {
		return soumissionnaireMoyenEvaluation;
	}
	/**
	 * @param soumissionnaireMoyenEvaluation the soumissionnaireMoyenEvaluation to set
	 */
	public void setSoumissionnaireMoyenEvaluation(
			Double soumissionnaireMoyenEvaluation) {
		this.soumissionnaireMoyenEvaluation = soumissionnaireMoyenEvaluation;
	}
	/**
	 * @return the soumissionnaireNombreMarchesGagnees
	 */
	public Integer getSoumissionnaireNombreMarchesGagnees() {
		return soumissionnaireNombreMarchesGagnees;
	}
	/**
	 * @param soumissionnaireNombreMarchesGagnees the soumissionnaireNombreMarchesGagnees to set
	 */
	public void setSoumissionnaireNombreMarchesGagnees(
			Integer soumissionnaireNombreMarchesGagnees) {
		this.soumissionnaireNombreMarchesGagnees = soumissionnaireNombreMarchesGagnees;
	}
	/**
	 * @return the soumissionnaireNombreMarchesEvaluees
	 */
	public Integer getSoumissionnaireNombreMarchesEvaluees() {
		return soumissionnaireNombreMarchesEvaluees;
	}
	/**
	 * @param soumissionnaireNombreMarchesEvaluees the soumissionnaireNombreMarchesEvaluees to set
	 */
	public void setSoumissionnaireNombreMarchesEvaluees(
			Integer soumissionnaireNombreMarchesEvaluees) {
		this.soumissionnaireNombreMarchesEvaluees = soumissionnaireNombreMarchesEvaluees;
	}
	/**
	 * @return the soumissionnaireNombreMarchesNonEvaluees
	 */
	public Integer getSoumissionnaireNombreMarchesNonEvaluees() {
		return soumissionnaireNombreMarchesNonEvaluees;
	}
	/**
	 * @param soumissionnaireNombreMarchesNonEvaluees the soumissionnaireNombreMarchesNonEvaluees to set
	 */
	public void setSoumissionnaireNombreMarchesNonEvaluees(
			Integer soumissionnaireNombreMarchesNonEvaluees) {
		this.soumissionnaireNombreMarchesNonEvaluees = soumissionnaireNombreMarchesNonEvaluees;
	}
	/**
	 * @return the soumissionnaireNoteGlobale
	 */
	public Double getSoumissionnaireNoteGlobale() {
		return soumissionnaireNoteGlobale;
	}
	/**
	 * @param soumissionnaireNoteGlobale the soumissionnaireNoteGlobale to set
	 */
	public void setSoumissionnaireNoteGlobale(Double soumissionnaireNoteGlobale) {
		this.soumissionnaireNoteGlobale = soumissionnaireNoteGlobale;
	}
	
	
	
	
	
	
	@OneToMany(cascade ={CascadeType.PERSIST, CascadeType.MERGE},
			fetch = FetchType.EAGER ,mappedBy="soumissionnaireReference")
	@Fetch(value = FetchMode.SUBSELECT)
	public List<Soumission> getSoumissionnaireListeSoumissions() {
		return soumissionnaireListeSoumissions;
	}
	/**
	 * @param soumissionnaireListeSoumissions the soumissionnaireListeSoumissions to set
	 */
	public void setSoumissionnaireListeSoumissions(
			List<Soumission> soumissionnaireListeSoumissions) {
		this.soumissionnaireListeSoumissions = soumissionnaireListeSoumissions;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
