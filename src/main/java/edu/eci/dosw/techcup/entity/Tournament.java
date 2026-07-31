package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.standings.Standing;
import edu.eci.dosw.techcup.entity.users.Organizer;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "max_number_of_teams", nullable = false)
	private Integer maxNoTeams;

	@Column(name = "cost_per_team_COP", nullable = false)
	private Double costPerTeamCOP;

	@Column(name = "description", length = 1024)
	private String description;

	@Column(name = "rules", length = 2048)
	private String rules;

	@Column(name = "starts_at", nullable = false)
	private LocalDateTime starsAt;

	@Column(name = "ends_at", nullable = false)
	private LocalDateTime endsAt;

	@Column(name = "inscription_dead_line", nullable = false)
	private LocalDateTime inscriptionDeadline;

	@Column(name = "created_on", nullable = false)
	private LocalDate createdOn;

	@ManyToOne
	@JoinColumn(name = "created_by", nullable = false)
	private Organizer organizer;

	@OneToMany(mappedBy = "tournament")
	private List<Match> matches;

	@OneToMany(mappedBy = "tournament")
	private List<Standing> standings;

	@OneToMany(mappedBy = "tournament")
	private List<Payment> payments;

	@PrePersist
	public void beforeInsert () {
		this.createdOn = LocalDate.now();
	}
}
