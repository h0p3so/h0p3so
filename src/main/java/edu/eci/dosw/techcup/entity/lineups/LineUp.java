package edu.eci.dosw.techcup.entity.lineups;

import edu.eci.dosw.techcup.entity.teams.Team;
import edu.eci.dosw.techcup.entity.users.Player;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
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
	private UUID lineUpId;

	@Column(name = "created_on")
	private LocalDate createdOn;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "team")
	private Team team;

	@OneToMany(mappedBy = "lineup")
	private List<LineUpPlayer> lineUp;
}
