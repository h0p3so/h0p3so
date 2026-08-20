package edu.eci.dosw.techcup.entity.tournament;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentTeamId implements Serializable {

	@Column(name = "team_id", nullable = false)
	private UUID teamId;

	@Column(name = "tournament_id", nullable = false)
	private UUID tournamentId;

	@Override
	public int hashCode() { return Objects.hash(this.teamId, this.tournamentId); }

	@Override
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if ((o instanceof TournamentTeamId) == false) {
			return false;
		}

		final TournamentTeamId other = (TournamentTeamId) o;
		return Objects.equals(this.teamId, other.getTeamId()) && Objects.equals(this.tournamentId, other.getTournamentId());
	}
}