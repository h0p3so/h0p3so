/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Tournament.java
 *
 * Defines basic information about tournaments.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.users.Organizer;
import edu.eci.dosw.techcup.enums.TournamentStatus;
import edu.eci.dosw.techcup.entity.Team;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "Tournament")
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Tournament {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID             id;
	private String           name;
	private Integer          maxNoTeams;
	private Double           costPerTeam;
	private String           description;
	private String           rules;
	private LocalDateTime    startDate;
	private LocalDateTime    endDate;
	private LocalDateTime    inscriptionDeadline;
	private LocalDateTime    createdOn;
	private Organizer        organizer;
	private TournamentStatus status;
	private List<Team>       teams;
}
