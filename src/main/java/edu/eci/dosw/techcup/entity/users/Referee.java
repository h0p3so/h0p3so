package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "referees")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Referee extends User {
	// TODO: relation with match
}