package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.teams.Team;
import edu.eci.dosw.techcup.entity.users.Capitan;
import edu.eci.dosw.techcup.entity.users.Player;
import edu.eci.dosw.techcup.enums.InvitationStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "invitations")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class Invitation {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "invitation_id")
	private UUID invitationId;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	private InvitationStatus status;

	@Column(name = "sent_at", nullable = false)
	private LocalDateTime sentAt;

	@ManyToOne
	@JoinColumn(name = "sent_by")
	private Capitan sentBy;

	@ManyToOne
	@JoinColumn(name = "sent_to")
	private Player sentTo;

	@ManyToOne
	@JoinColumn(name = "team")
	private Team team;
}
