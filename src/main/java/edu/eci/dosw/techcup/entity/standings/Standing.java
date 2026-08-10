package edu.eci.dosw.techcup.entity.standings;

import edu.eci.dosw.techcup.entity.tournament.Tournament;
import edu.eci.dosw.techcup.entity.teams.Team;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "standings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Check(constraints = """
	matches_played >= 0  AND
	matches_won    >= 0  AND
	matches_lost   >= 0  AND
	matches_drawn  >= 0  AND
	goals_made     >= 0  AND
	goals_against  >= 0  AND
	total_points   >= 0
""")
public class Standing {
	@EmbeddedId
	private StandingId standingId;

	@Column(name = "matches_played", nullable = false)
	private Integer matchesPlayed;

	@Column(name = "matches_won", nullable = false)
	private Integer matchesWon;

	@Column(name = "matches_lost", nullable = false)
	private Integer matchesLost;

	@Column(name = "matches_drawn", nullable = false)
	private Integer matchesDrawn;

	@Column(name = "goals_made", nullable = false)
	private Integer goalsMade;

	@Column(name = "goals_against", nullable = false)
	private Integer goalsAgainst;

	@Column(name = "total_points", nullable = false)
	private Integer points;

	@Column(name = "last_update", nullable = false)
	private LocalDateTime lastUpdate;

	@Column(name = "goal_diff", nullable = false)
	private Integer goalsDiff;

	@ManyToOne
	@MapsId("teamId")
	@JoinColumn(name = "team_id", nullable = false)
	private Team team;

	@ManyToOne
	@MapsId("tournamentId")
	@JoinColumn(name = "tournament_id", nullable = false)
	private Tournament tournament;

	@PrePersist
	public void beforeInsert () {
		this.matchesPlayed = 0;
		this.matchesWon = 0;
		this.matchesLost = 0;
		this.matchesDrawn = 0;
		this.goalsAgainst = 0;
		this.goalsMade = 0;
		this.points = 0;
		this.goalsDiff = 0;
		this.lastUpdate = LocalDateTime.now();
	}

	@PreUpdate
	public void beforeUpdate () {
		this.lastUpdate = LocalDateTime.now();
		this.goalsDiff = this.goalsMade - this.goalsAgainst;
	}


}
