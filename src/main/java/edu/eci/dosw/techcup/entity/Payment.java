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
	@Column(name = "payment_id")
	private UUID paymentId;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private PaymentStatus status;

	@Column(name = "uploaded_at")
	private LocalDateTime uploadedAt;

	@Column(name = "proofURL")
	private String proofURL;

	@ManyToOne
	@JoinColumn(name = "uploaded_by")
	private Capitan uploadedBy;

	@ManyToOne
	@JoinColumn(name = "torunament")
	private Tournament tournament;
}
