/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Field.java
 *
 * Defines basic information about fields.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.Tournament;
import edu.eci.dosw.techcup.entity.Team;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.time.LocalTime;

@Entity
@Table(name = "standing")
@NoArgsConstructor
@Getter
@Setter
public class Standing {
	private UUID       id;
	private Tournament tournament;
	private Team       team;
	private Integer    matchesPlayed;
	private Integer    matchesWon;
	private Integer    matchesLost;
	private Integer    goalsMade;
	private Integer    goalsAgainst;
	private Integer    points;
	private LocalTime  lastUpdate;

	public Integer getGoalsDiff () {
		return this.goalsMade - this.goalsAgainst;
	}
}
