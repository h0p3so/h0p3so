package edu.eci.dosw.techcup.entity.lineups;

import edu.eci.dosw.techcup.entity.users.FamilyStudentId;
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
public class LineUpPlayerId implements Serializable {
	@Column(name = "player_id", nullable = false)
	private UUID playerId;

	@Column(name = "lineup_id", nullable = false)
	private UUID lineUpId;

	@Override
	public int hashCode () { return Objects.hash(this.lineUpId, this.playerId); }

	@Override
	public boolean equals (final Object o) {
		if (this == o) {
			return true;
		}
		if ((o instanceof LineUpPlayerId) == false) {
			return false;
		}

		final LineUpPlayerId other = (LineUpPlayerId) o;
		return Objects.equals(this.playerId, other.getPlayerId()) && Objects.equals(this.lineUpId, other.getLineUpId());
	}
}
