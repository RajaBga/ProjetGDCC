package com.xtensus.xteldap.domain;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "categoriesprojet")
public class Categoriesprojet  implements java.io.Serializable {

	private static final long serialVersionUID = -102579463788626212L;
	private Long categoriesProjetId;
	private String categoriesProjetLibelle;
	private String categoriesProjetDescription;

	public Categoriesprojet() {
	}

	public Categoriesprojet(
			String categoriesProjetLibelle,
			String categoriesProjetDescription) {
		this.categoriesProjetLibelle = categoriesProjetLibelle;
		this.categoriesProjetDescription = categoriesProjetDescription;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoriesProjetId", unique = true, nullable = false)
	public Long getCategoriesProjetId() {
		return this.categoriesProjetId;
	}

	public void setCategoriesProjetId(Long categoriesProjetId) {
		this.categoriesProjetId = categoriesProjetId;
	}

	@Column(name = "categoriesProjetLibelle", length = 50)
	public String getCategoriesProjetLibelle() {
		return this.categoriesProjetLibelle;
	}

	public void setCategoriesProjetLibelle(String categoriesProjetLibelle) {
		this.categoriesProjetLibelle = categoriesProjetLibelle;
	}

	@Column(name = "categoriesProjetDescription", length = 65535)
	public String getCategoriesProjetDescription() {
		return this.categoriesProjetDescription;
	}

	public void setCategoriesProjetDescription(
			String categoriesProjetDescription) {
		this.categoriesProjetDescription = categoriesProjetDescription;
	}
}
