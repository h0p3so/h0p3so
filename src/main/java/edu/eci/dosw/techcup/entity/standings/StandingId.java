package edu.eci.dosw.techcup.entity.standings;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StandingId implements Serializable {
	@Column(name = "team_id", nullable = false)
	private UUID teamId;

	@Column(name = "tournament_id", nullable = false)
	private UUID tournamentId;

	@Override
	public int hashCode () { return Objects.hash(this.tournamentId, this.teamId); }

	@Override
	public boolean equals (final Object o) {
		if (this == o) {
			return true;
		}
		if ((o instanceof StandingId) == false) {
			return false;
		}
		final StandingId other = (StandingId) o;
		return Objects.equals(this.getTeamId(), other.getTeamId()) && Objects.equals(this.getTournamentId(), other.getTournamentId());
	}
}
