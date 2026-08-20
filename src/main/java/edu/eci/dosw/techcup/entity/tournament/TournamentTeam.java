package edu.eci.dosw.techcup.entity.tournament;

import edu.eci.dosw.techcup.entity.teams.Team;
import edu.eci.dosw.techcup.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tournament_teams")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TournamentTeam {

	@EmbeddedId
	private TournamentTeamId id;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	private PaymentStatus status;

	@Column(name = "registered_at", nullable = false, updatable = false)
	private LocalDateTime registeredAt;

	@Column(name = "reviewed_at")
	private LocalDateTime reviewedAt;

	@ManyToOne
	@MapsId("teamId")
	@JoinColumn(name = "team_id", nullable = false)
	private Team team;

	@ManyToOne
	@MapsId("tournamentId")
	@JoinColumn(name = "tournament_id", nullable = false)
	private Tournament tournament;

	@OneToOne
	@JoinColumn(name = "payment_id")
	private Payment payment;

	@PrePersist
	public void beforeInsert () {
		this.status = PaymentStatus.PENDING;
		this.registeredAt = LocalDateTime.now();
	}

	@PreUpdate
	public void beforeUpdate () {
		if (this.status != PaymentStatus.PENDING && this.reviewedAt == null) {
			this.reviewedAt = LocalDateTime.now();
		}
	}
}