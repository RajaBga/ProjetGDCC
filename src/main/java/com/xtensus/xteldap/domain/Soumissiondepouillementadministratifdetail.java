package com.xtensus.xteldap.domain;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name="soumissiondepouillementadministratifdetail")
public class Soumissiondepouillementadministratifdetail extends Entite implements Serializable {
	
	
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

private long 	soumissiondepouillementadministratifdetail_Id ;
	private boolean  soumissiondepouillementadministratifdetail_Valuer ;
	public Soumissiondepouillementadministratifdetail() {
		super();
	}
	public Soumissiondepouillementadministratifdetail(long soumissiondepouillementadministratifdetail_Id,
			boolean soumissiondepouillementadministratifdetail_Valuer) {
		super();
		this.soumissiondepouillementadministratifdetail_Id = soumissiondepouillementadministratifdetail_Id;
		this.soumissiondepouillementadministratifdetail_Valuer = soumissiondepouillementadministratifdetail_Valuer;
	}
	public long getSoumissiondepouillementadministratifdetail_Id() {
		return soumissiondepouillementadministratifdetail_Id;
	}
	public void setSoumissiondepouillementadministratifdetail_Id(long soumissiondepouillementadministratifdetail_Id) {
		this.soumissiondepouillementadministratifdetail_Id = soumissiondepouillementadministratifdetail_Id;
	}
	public boolean isSoumissiondepouillementadministratifdetail_Valuer() {
		return soumissiondepouillementadministratifdetail_Valuer;
	}
	public void setSoumissiondepouillementadministratifdetail_Valuer(
			boolean soumissiondepouillementadministratifdetail_Valuer) {
		this.soumissiondepouillementadministratifdetail_Valuer = soumissiondepouillementadministratifdetail_Valuer;
	}
	@Override
	public String toString() {
		return "Soumissiondepouillementadministratifdetail [soumissiondepouillementadministratifdetail_Id="
				+ soumissiondepouillementadministratifdetail_Id + ", soumissiondepouillementadministratifdetail_Valuer="
				+ soumissiondepouillementadministratifdetail_Valuer + "]";
	}
	
	
	
	
}
