package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.users.Organizer;
import edu.eci.dosw.techcup.enums.TournamentStatus;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TOURNAMENT")
@NoArgsConstructor
public class Tournament {
	private UUID             tournamentId;
	private String           name;
	private LocalDate        startDate;
	private LocalDate        endDate;
	private LocalDate        limitInscriptionDate;
	private LocalDate        creationDate;
	private Integer          maxNoTeams;
	private Double           costPerTeam;
	private TournamentStatus status;
	private Organizer        organizer;
}
