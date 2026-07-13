package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "admins")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Admin extends User {
	@OneToMany(mappedBy = "grantedBy")
	List<Capitan> capitanDelegations;

	@OneToMany(mappedBy = "grantedBy")
	List<Organizer> organizersDelegations;
}