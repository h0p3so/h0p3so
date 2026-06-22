package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.lineups.LineUp;
import edu.eci.dosw.techcup.entity.teams.Team;
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
	@Column(name = "match_id")
	private UUID matchId;

	@Column(name = "scheduled_at", nullable = false)
	private LocalDateTime scheduledAt;

	@Column(name = "expected_duration")
	private Integer expectedDuration;

	@Column(name = "actual_duration")
	private Integer actualDuration;

	@Enumerated(EnumType.STRING)
	@Column(name = "stage")
	private MatchStage stage;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private MatchStatus status;

	@Column(name = "team_one_score")
	private Integer teamOneScore;

	@Column(name = "team_two_score")
	private Integer teamTwoScore;

	@OneToOne
	@JoinColumn(name = "team_one")
	private Team teamOne;

	@OneToOne
	@JoinColumn(name = "team_two")
	private Team teamTwo;

	@OneToOne
	@JoinColumn(name = "field")
	private Field field;

	@ManyToOne
	@JoinColumn(name = "referee")
	private Referee referee;

	@ManyToOne
	@JoinColumn(name = "team_one_line_up")
	private LineUp teamOneLineUp;

	@ManyToOne
	@JoinColumn(name = "team_two_line_up")
	private LineUp teamTwoLineUp;

	@OneToMany(mappedBy = "match")
	List<MatchEvent> events;
}
