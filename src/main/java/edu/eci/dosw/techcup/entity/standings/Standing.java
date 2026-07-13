package edu.eci.dosw.techcup.entity.standings;

import edu.eci.dosw.techcup.entity.Tournament;
import edu.eci.dosw.techcup.entity.teams.Team;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "standings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Standing {
	@EmbeddedId
	private StandingId standingId;

	@ManyToOne
	@MapsId("teamId")
	@JoinColumn(name = "team_id")
	private Team team;

	@ManyToOne
	@MapsId("tournamentId")
	@JoinColumn(name = "tournament_id")
	private Tournament tournament;

	@Column(name = "matches_played")
	private Integer matchesPlayed;

	@Column(name = "matches_won")
	private Integer matchesWon;

	@Column(name = "matches_lost")
	private Integer matchesLost;

	@Column(name = "goals_made")
	private Integer goalsMade;

	@Column(name = "goals_against")
	private Integer goalsAgainst;

	@Column(name = "total_points")
	private Integer points;

	@Column(name = "last_update")
	private LocalDateTime lastUpdate;
}
