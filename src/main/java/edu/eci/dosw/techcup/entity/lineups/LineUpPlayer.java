package edu.eci.dosw.techcup.entity.lineups;

import edu.eci.dosw.techcup.entity.users.Player;
import edu.eci.dosw.techcup.enums.LineUpPosition;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lineup_players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LineUpPlayer {
	@EmbeddedId
	private LineUpPlayerId id;

	@ManyToOne
	@MapsId("playerId")
	@JoinColumn(name = "player")
	private Player player;

	@ManyToOne
	@MapsId("lineUpId")
	@JoinColumn(name = "lineup")
	private LineUp lineup;

	@Enumerated(EnumType.STRING)
	@Column(name = "summoned_as", nullable = false)
	private LineUpPosition summonedAs;
}
