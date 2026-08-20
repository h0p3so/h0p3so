package edu.eci.dosw.techcup.entity.tournament;

import edu.eci.dosw.techcup.entity.users.Capitan;
import edu.eci.dosw.techcup.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "payments")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "payment_id", nullable = false, updatable = false)
	private UUID paymentId;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	private PaymentStatus status;

	@Column(name = "uploaded_at", nullable = false, updatable = false)
	private LocalDateTime uploadedAt;

	@Column(name = "reviewed_at")
	private LocalDateTime reviewedAt;

	@Column(name = "proof_url", nullable = false)
	private String proofURL;

	@Column(name = "rejection_reason")
	private String rejectionReason;

	@ManyToOne
	@JoinColumn(name = "uploaded_by", nullable = false)
	private Capitan uploadedBy;

	@OneToOne(mappedBy = "payment")
	private TournamentTeam tournamentTeam;

	@PrePersist
	public void beforeInsert () {
		this.status = PaymentStatus.PENDING;
		this.uploadedAt = LocalDateTime.now();
	}

	@PreUpdate
	public void beforeUpdate () {
		if ((this.status == PaymentStatus.ACCEPTED || this.status == PaymentStatus.REJECTED) && this.reviewedAt == null) {
			this.reviewedAt = LocalDateTime.now();
		}
	}
}
