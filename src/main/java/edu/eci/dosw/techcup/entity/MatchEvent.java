/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * MatchEvent.java
 *
 * Defines basic information about matches.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.Match;
import edu.eci.dosw.techcup.entity.TeamMember;
import edu.eci.dosw.techcup.enums.MatchEventType;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "MatchEvents")
@NoArgsConstructor
@Getter
@Setter
public class MatchEvent {
	private UUID           id;
	private Match          match;
	private TeamMember     player;
	private Integer        minute;
	private MatchEventType type;
}
