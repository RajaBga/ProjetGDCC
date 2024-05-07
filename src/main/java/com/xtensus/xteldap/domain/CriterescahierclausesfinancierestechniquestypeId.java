package com.xtensus.xteldap.domain;


import jakarta.persistence.*;


@Embeddable
public class CriterescahierclausesfinancierestechniquestypeId  implements
		java.io.Serializable {

	private static final long serialVersionUID = -5937542299820692769L;
	private long cahierClausesFinancieresTechniquesId;
	private long criteresId;

	public CriterescahierclausesfinancierestechniquestypeId() {
	}

	public CriterescahierclausesfinancierestechniquestypeId(
			long cahierClausesFinancieresTechniquesId, long criteresId) {
		this.cahierClausesFinancieresTechniquesId = cahierClausesFinancieresTechniquesId;
		this.criteresId = criteresId;
	}

	@Column(name = "cahierClausesFinancieresTechniquesId", nullable = false)
	public long getCahierClausesFinancieresTechniquesId() {
		return this.cahierClausesFinancieresTechniquesId;
	}

	public void setCahierClausesFinancieresTechniquesId(
			long cahierClausesFinancieresTechniquesId) {
		this.cahierClausesFinancieresTechniquesId = cahierClausesFinancieresTechniquesId;
	}

	@Column(name = "criteresId", nullable = false)
	public long getCriteresId() {
		return this.criteresId;
	}

	public void setCriteresId(long criteresId) {
		this.criteresId = criteresId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CriterescahierclausesfinancierestechniquestypeId))
			return false;
		CriterescahierclausesfinancierestechniquestypeId castOther = (CriterescahierclausesfinancierestechniquestypeId) other;

		return (this.getCahierClausesFinancieresTechniquesId() == castOther
				.getCahierClausesFinancieresTechniquesId())
				&& (this.getCriteresId() == castOther.getCriteresId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (int) this.getCahierClausesFinancieresTechniquesId();
		result = 37 * result + (int) this.getCriteresId();
		return result;
	}

}
