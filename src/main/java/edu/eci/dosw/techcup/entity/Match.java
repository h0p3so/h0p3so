package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.lineups.LineUp;
import edu.eci.dosw.techcup.entity.teams.Team;
import edu.eci.dosw.techcup.entity.tournament.Tournament;
import edu.eci.dosw.techcup.entity.users.Referee;
import edu.eci.dosw.techcup.enums.MatchStage;
import edu.eci.dosw.techcup.enums.MatchStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "matches")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Match {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "match_id", nullable = false, updatable = false)
	private UUID matchId;

	@Column(name = "scheduled_at", nullable = false)
	private LocalDateTime scheduledAt;

	@Column(name = "expected_duration", nullable = false)
	private Integer expectedDuration;

	@Column(name = "actual_duration")
	private Integer actualDuration;

	@Enumerated(EnumType.STRING)
	@Column(name = "stage", nullable = false)
	private MatchStage stage;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	private MatchStatus status;

	@Column(name = "team_one_score", nullable = false)
	private Integer teamOneScore;

	@Column(name = "team_two_score", nullable = false)
	private Integer teamTwoScore;

	@ManyToOne
	@JoinColumn(name = "team_one", nullable = false)
	private Team teamOne;

	@ManyToOne
	@JoinColumn(name = "team_two", nullable = false)
	private Team teamTwo;

	@ManyToOne
	@JoinColumn(name = "field", nullable = false)
	private Field field;

	@ManyToOne
	@JoinColumn(name = "referee", nullable = false)
	private Referee referee;

	@ManyToOne
	@JoinColumn(name = "team_one_line_up", nullable = false)
	private LineUp teamOneLineUp;

	@ManyToOne
	@JoinColumn(name = "team_two_line_up", nullable = false)
	private LineUp teamTwoLineUp;

	@ManyToOne
	@JoinColumn(name = "tournament", nullable = false)
	private Tournament tournament;

	@OneToMany(mappedBy = "match")
	private List<MatchEvent> events;

	@PrePersist
	public void beforeInsert () {
		this.stage = MatchStage.GROUP;
		this.status = MatchStatus.SCHEDULED;
		this.teamOneScore = 0;
		this.teamTwoScore = 0;
	}
}
