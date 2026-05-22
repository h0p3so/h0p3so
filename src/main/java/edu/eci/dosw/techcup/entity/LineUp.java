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

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "LineUp")
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LineUp {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private Team team;
	private List<TeamMember> starters;
	private List<TeamMember> substitutes;
	private String description;
}
