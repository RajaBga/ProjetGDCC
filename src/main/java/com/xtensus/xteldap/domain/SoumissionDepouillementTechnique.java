package com.xtensus.xteldap.domain;

import java.io.Serializable;
import java.util.Date;

public class SoumissionDepouillementTechnique extends Entite implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private Long   soumissionDepouillementTechniqueId ;
	private Float  soumissionDepouillementTechniqueNoteTechnique ;
	private Float  soumissionDepouillementTechniquePourcentageNoteTechnique ; 
	private String soumissionDepouillementEtatTechniqueTechniqueSoumission ;
	private Date   soumissionDepouillementTechniqueDate ; 
	
	//soumissionDepouillementTechniqueUserId
	
	
	
	
	
	/**
	 * @return the soumissionDepouillementTechniqueId
	 */
	public Long getSoumissionDepouillementTechniqueId() {
		return soumissionDepouillementTechniqueId;
	}
	/**
	 * @param soumissionDepouillementTechniqueId the soumissionDepouillementTechniqueId to set
	 */
	public void setSoumissionDepouillementTechniqueId(
			Long soumissionDepouillementTechniqueId) {
		this.soumissionDepouillementTechniqueId = soumissionDepouillementTechniqueId;
	}
	/**
	 * @return the soumissionDepouillementTechniqueNoteTechnique
	 */
	public Float getSoumissionDepouillementTechniqueNoteTechnique() {
		return soumissionDepouillementTechniqueNoteTechnique;
	}
	/**
	 * @param soumissionDepouillementTechniqueNoteTechnique the soumissionDepouillementTechniqueNoteTechnique to set
	 */
	public void setSoumissionDepouillementTechniqueNoteTechnique(
			Float soumissionDepouillementTechniqueNoteTechnique) {
		this.soumissionDepouillementTechniqueNoteTechnique = soumissionDepouillementTechniqueNoteTechnique;
	}
	/**
	 * @return the soumissionDepouillementTechniquePourcentageNoteTechnique
	 */
	public Float getSoumissionDepouillementTechniquePourcentageNoteTechnique() {
		return soumissionDepouillementTechniquePourcentageNoteTechnique;
	}
	/**
	 * @param soumissionDepouillementTechniquePourcentageNoteTechnique the soumissionDepouillementTechniquePourcentageNoteTechnique to set
	 */
	public void setSoumissionDepouillementTechniquePourcentageNoteTechnique(
			Float soumissionDepouillementTechniquePourcentageNoteTechnique) {
		this.soumissionDepouillementTechniquePourcentageNoteTechnique = soumissionDepouillementTechniquePourcentageNoteTechnique;
	}
	/**
	 * @return the soumissionDepouillementEtatTechniqueTechniqueSoumission
	 */
	public String getSoumissionDepouillementEtatTechniqueTechniqueSoumission() {
		return soumissionDepouillementEtatTechniqueTechniqueSoumission;
	}
	/**
	 * @param soumissionDepouillementEtatTechniqueTechniqueSoumission the soumissionDepouillementEtatTechniqueTechniqueSoumission to set
	 */
	public void setSoumissionDepouillementEtatTechniqueTechniqueSoumission(
			String soumissionDepouillementEtatTechniqueTechniqueSoumission) {
		this.soumissionDepouillementEtatTechniqueTechniqueSoumission = soumissionDepouillementEtatTechniqueTechniqueSoumission;
	}
	/**
	 * @return the soumissionDepouillementTechniqueDate
	 */
	public Date getSoumissionDepouillementTechniqueDate() {
		return soumissionDepouillementTechniqueDate;
	}
	/**
	 * @param soumissionDepouillementTechniqueDate the soumissionDepouillementTechniqueDate to set
	 */
	public void setSoumissionDepouillementTechniqueDate(
			Date soumissionDepouillementTechniqueDate) {
		this.soumissionDepouillementTechniqueDate = soumissionDepouillementTechniqueDate;
	}
	
	
	
	
	

}
