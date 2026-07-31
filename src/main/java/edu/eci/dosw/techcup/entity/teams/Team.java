package edu.eci.dosw.techcup.entity.teams;

import edu.eci.dosw.techcup.entity.lineups.LineUp;
import edu.eci.dosw.techcup.entity.Invitation;
import edu.eci.dosw.techcup.entity.standings.Standing;
import edu.eci.dosw.techcup.entity.users.Capitan;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "teams")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "team_id", nullable = false, updatable = false)
	private UUID teamId;

	@Column(name = "name", nullable = false, unique = true)
	private String name;

	@Column(name = "color_one", nullable = false)
	private Integer colorOne;

	@Column(name = "color_two")
	private Integer colorTwo;

	@Column(name = "logo_url")
	private String logoURL;

	@Column(name = "background_url")
	private String backgroundURL;

	@Column(name = "creation_date", nullable = false, updatable = false)
	private LocalDate creationDate;

	@ManyToOne
	@JoinColumn(name = "capitan", nullable = false)
	private Capitan capitan;

	@OneToMany(mappedBy = "team")
	private List<TeamPlayer> players;

	@OneToMany(mappedBy = "team")
	private List<Invitation> invitations;

	@OneToMany(mappedBy = "team")
	private List<LineUp> lineups;

	@OneToMany(mappedBy = "team")
	private List<Standing> standings;

	@PrePersist
	public void beforeInsert () {
		this.creationDate = LocalDate.now();
	}
}
