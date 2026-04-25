/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Match.java
 *
 * Defines basic information about matches.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.Team;
import edu.eci.dosw.techcup.entity.LineUp;
import edu.eci.dosw.techcup.entity.Tournament;
import edu.eci.dosw.techcup.entity.Field;
import edu.eci.dosw.techcup.entity.users.Referee;
import edu.eci.dosw.techcup.enums.MatchStage;
import edu.eci.dosw.techcup.enums.MatchStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "match")
@NoArgsConstructor
@Getter
@Setter
public class Match {
	private UUID             id;
	private Team             team1;
	private Team             team2;
	private Tournament       tournament;
	private Field            playedIn;
	private Referee          referee;
	private LocalDateTime    scheduledAt;
	private Integer          duration;
	private MatchStage       stage;
	private Integer          team1Score;
	private Integer          team2Score;
	private MatchStatus      status;
	private List<MatchEvent> events;
	private LineUp           team1lineUp;
	private LineUp           team2lineUp;
}
