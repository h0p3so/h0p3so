package edu.eci.dosw.techcup.entity.teams;

import edu.eci.dosw.techcup.entity.users.Player;
import edu.eci.dosw.techcup.enums.PlayerPosition;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "team_players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamPlayer {
	@EmbeddedId
	private TeamPlayerId teamPlayerId;

	@Enumerated(EnumType.STRING)
	@Column(name = "position", nullable = false)
	private PlayerPosition position;

	@Column(name = "dorsal_number", nullable = false)
	private Integer dorsalNumber;

	@Column(name = "joined_on", nullable = false, updatable = false)
	private LocalDate joinedOn;

	@Column(name = "left_on")
	private LocalDate leftOn;

	@ManyToOne
	@MapsId("playerId")
	@JoinColumn(name = "player_id", nullable = false)
	private Player player;

	@ManyToOne
	@MapsId("teamId")
	@JoinColumn(name = "team_id", nullable = false)
	private Team team;

	@PrePersist
	public void beforeInsert () {
		this.joinedOn = LocalDate.now();
	}
}
