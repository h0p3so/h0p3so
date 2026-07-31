package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.entity.Invitation;
import edu.eci.dosw.techcup.entity.Payment;
import edu.eci.dosw.techcup.entity.teams.Team;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "capitans")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Capitan extends Player {
	@Column(name = "capitan_since", nullable = false, updatable = false)
	private LocalDate capitanSince;

	@ManyToOne
	@JoinColumn(name = "granted_by", nullable = false)
	private Admin grantedBy;

	@OneToMany(mappedBy = "capitan")
	private List<Team> teams;

	@OneToMany(mappedBy = "sentBy")
	private List<Invitation> invitations;

	@OneToMany(mappedBy = "uploadedBy")
	private List<Payment> payments;

	@PrePersist
	public void beforeInsert () {
		this.capitanSince = LocalDate.now();
	}
}