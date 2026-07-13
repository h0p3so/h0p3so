package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.standings.Standing;
import edu.eci.dosw.techcup.entity.users.Organizer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tournaments")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tournament {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID tournamentId;

	@Column(name = "name")
	private String name;

	@Column(name = "max_number_of_teams")
	private Integer maxNoTeams;

	@Column(name = "cost_per_team")
	private Double costPerTeam;

	@Column(name = "description")
	private String description;

	@Column(name = "rules")
	private String rules;

	@Column(name = "starts_at")
	private LocalDateTime starsAt;

	@Column(name = "ends_at")
	private LocalDateTime endsAt;

	@Column(name = "inscription_dead_line")
	private LocalDateTime inscriptionDeadline;

	@Column(name = "created_on")
	private LocalDateTime createdOn;

	@ManyToOne
	@JoinColumn(name = "created_by")
	private Organizer organizer;

	@OneToMany(mappedBy = "tournament")
	List<Match> matches;

	@OneToMany(mappedBy = "tournament")
	List<Standing> standings;

	@OneToMany(mappedBy = "tournament")
	List<Payment> payments;
}
