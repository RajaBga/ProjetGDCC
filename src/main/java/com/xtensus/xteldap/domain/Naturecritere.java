package com.xtensus.xteldap.domain;


import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "naturecritere")
public class Naturecritere implements java.io.Serializable {

	private static final long serialVersionUID = 6891538433303094422L;
	 @Column(name="natureCritereId")
    private Long natureCritereId;
    @Column(name="natureCritereLibelle")
     private String natureCritereLibelle;
    @Column(name="natureCritereDescription")
    private String natureCritereDescription;

	public Naturecritere() {
	}

	public Naturecritere(String natureCritereLibelle,
			String natureCritereDescription) {
		this.natureCritereLibelle = natureCritereLibelle;
		this.natureCritereDescription = natureCritereDescription;

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "natureCritereId", unique = true, nullable = false)
	public Long getNatureCritereId() {
		return this.natureCritereId;
	}

	public void setNatureCritereId(Long natureCritereId) {
		this.natureCritereId = natureCritereId;
	}

	@Column(name = "natureCritereLibelle", length = 50)
	public String getNatureCritereLibelle() {
		return this.natureCritereLibelle;
	}

	public void setNatureCritereLibelle(String natureCritereLibelle) {
		this.natureCritereLibelle = natureCritereLibelle;
	}

	@Column(name = "natureCritereDescription", length = 65535)
	public String getNatureCritereDescription() {
		return this.natureCritereDescription;
	}

	public void setNatureCritereDescription(String natureCritereDescription) {
		this.natureCritereDescription = natureCritereDescription;
	}

}
