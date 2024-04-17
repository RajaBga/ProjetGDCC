package com.xtensus.xteldap.domain;

import java.io.Serializable;

public class SoumissionDepouillementAdministratifDetails extends Entite implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private Long    soumissionDepouillementAdministratifDetailsId ; 
	private Float   soumissionDepouillementAdministratifDetails_Valeur ;
	private Boolean soumissionDepouillementAdministratifDetails_Obligatoire ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @return the soumissionDepouillementAdministratifDetailsId
	 */
	public Long getSoumissionDepouillementAdministratifDetailsId() {
		return soumissionDepouillementAdministratifDetailsId;
	}
	/**
	 * @param soumissionDepouillementAdministratifDetailsId the soumissionDepouillementAdministratifDetailsId to set
	 */
	public void setSoumissionDepouillementAdministratifDetailsId(
			Long soumissionDepouillementAdministratifDetailsId) {
		this.soumissionDepouillementAdministratifDetailsId = soumissionDepouillementAdministratifDetailsId;
	}
	/**
	 * @return the soumissionDepouillementAdministratifDetails_Valeur
	 */
	public Float getSoumissionDepouillementAdministratifDetails_Valeur() {
		return soumissionDepouillementAdministratifDetails_Valeur;
	}
	/**
	 * @param soumissionDepouillementAdministratifDetails_Valeur the soumissionDepouillementAdministratifDetails_Valeur to set
	 */
	public void setSoumissionDepouillementAdministratifDetails_Valeur(
			Float soumissionDepouillementAdministratifDetails_Valeur) {
		this.soumissionDepouillementAdministratifDetails_Valeur = soumissionDepouillementAdministratifDetails_Valeur;
	}
	/**
	 * @return the soumissionDepouillementAdministratifDetails_Obligatoire
	 */
	public Boolean getSoumissionDepouillementAdministratifDetails_Obligatoire() {
		return soumissionDepouillementAdministratifDetails_Obligatoire;
	}
	/**
	 * @param soumissionDepouillementAdministratifDetails_Obligatoire the soumissionDepouillementAdministratifDetails_Obligatoire to set
	 */
	public void setSoumissionDepouillementAdministratifDetails_Obligatoire(
			Boolean soumissionDepouillementAdministratifDetails_Obligatoire) {
		this.soumissionDepouillementAdministratifDetails_Obligatoire = soumissionDepouillementAdministratifDetails_Obligatoire;
	}
	
	
	
	
	
	

}
