package edu.eci.dosw.techcup.entity;

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
	@GeneratedValue
	@Column(name = "payment_id", nullable = false, updatable = false)
	private UUID paymentId;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	private PaymentStatus status;

	@Column(name = "uploaded_at", nullable = false, updatable = false)
	private LocalDateTime uploadedAt;

	@Column(name = "proofURL", nullable = false)
	private String proofURL;

	@ManyToOne
	@JoinColumn(name = "uploaded_by", nullable = false)
	private Capitan uploadedBy;

	@ManyToOne
	@JoinColumn(name = "torunament", nullable = false)
	private Tournament tournament;

	@PrePersist
	public void beforeInsert () {
		this.status = PaymentStatus.PENDING;
		this.uploadedAt = LocalDateTime.now();
	}
}
