package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "organizers")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Organizer extends User {
	@ManyToOne
	@JoinColumn(name = "granted_by")
	private Admin grantedBy;
}