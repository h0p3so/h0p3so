package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.entity.tournament.Tournament;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "organizers")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Organizer extends User {
	@ManyToOne
	@JoinColumn(name = "granted_by", nullable = false)
	private Admin grantedBy;

	@OneToMany(mappedBy = "organizer")
	private List<Tournament> tournaments;
}