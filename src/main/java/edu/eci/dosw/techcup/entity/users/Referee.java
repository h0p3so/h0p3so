package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.entity.Match;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "referees")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Referee extends User {
	@OneToMany(mappedBy = "referee")
	private List<Match> matches;
}