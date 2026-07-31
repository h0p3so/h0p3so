package edu.eci.dosw.techcup.entity.teams;

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
public class TeamPlayerId implements Serializable {
	@Column(name = "player_id", nullable = false)
	private UUID playerId;

	@Column(name = "team_id", nullable = false)
	private UUID teamId;

	@Override
	public int hashCode () { return Objects.hash(this.playerId, this.teamId); }

	@Override
	public boolean equals (final Object o) {
		if (this == o) {
			return true;
		}
		if ((o instanceof TeamPlayerId) == false) {
			return false;
		}
		final TeamPlayerId other = (TeamPlayerId) o;
		return Objects.equals(this.getPlayerId(), other.getPlayerId()) &&
				Objects.equals(this.getTeamId(), other.getTeamId());
	}
}
