package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.entity.lineups.LineUp;
import edu.eci.dosw.techcup.entity.Invitation;
import edu.eci.dosw.techcup.entity.teams.TeamPlayer;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "players")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Player extends User {
	@OneToMany(mappedBy = "player")
	private List<TeamPlayer> havePlayedIn;

	@OneToMany(mappedBy = "sentTo")
	private List<Invitation> invitations;

	@OneToMany(mappedBy = "player")
	private List<TeamPlayer> lineUps;
}