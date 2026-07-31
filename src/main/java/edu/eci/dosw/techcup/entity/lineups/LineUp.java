package edu.eci.dosw.techcup.entity.lineups;

import edu.eci.dosw.techcup.entity.teams.Team;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "line_ups")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LineUp {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "lineup_id", updatable = false, nullable = false)
	private UUID lineUpId;

	@Column(name = "created_on", nullable = false, updatable = false)
	private LocalDate createdOn;

	@Column(name = "description", length = 1024)
	private String description;

	@ManyToOne
	@JoinColumn(name = "team", nullable = false)
	private Team team;

	@OneToMany(mappedBy = "lineup")
	private List<LineUpPlayer> lineUp;

	@PrePersise
	public void beforeInsert () {
		this.createdOn = LocalDate.now();
	}
}
