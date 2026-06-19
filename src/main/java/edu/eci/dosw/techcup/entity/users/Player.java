package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.entity.teams.TeamPlayer;
import edu.eci.dosw.techcup.enums.PlayerPosition;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "players")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
public class Player extends User {
	@OneToMany(mappedBy = "player")
	List<TeamPlayer> havePlayedIn;
}