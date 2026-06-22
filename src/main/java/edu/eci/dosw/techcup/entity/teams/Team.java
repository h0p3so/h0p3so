package edu.eci.dosw.techcup.entity.teams;

import edu.eci.dosw.techcup.entity.lineups.LineUp;
import edu.eci.dosw.techcup.entity.Invitation;
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
	@Column(name = "team_id")
	private UUID teamId;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "color_one", nullable = false)
	private Integer colorOne;

	@Column(name = "color_two", nullable = false)
	private Integer colorTwo;

	@Column(name = "logo_url")
	private String logoURL;

	@Column(name = "background_url")
	private String backgroundURL;

	@Column(name = "creation_date")
	private LocalDate creationDate;

	@ManyToOne
	@JoinColumn(name = "capitan")
	private Capitan capitan;

	@OneToMany(mappedBy = "team")
	List<TeamPlayer> players;

	@OneToMany(mappedBy = "team")
	List<Invitation> invitations;

	@OneToMany(mappedBy = "team")
	List<LineUp> lineups;
}
