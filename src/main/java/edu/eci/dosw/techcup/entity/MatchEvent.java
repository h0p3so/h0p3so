package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.users.Player;
import edu.eci.dosw.techcup.enums.MatchEventType;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "match_events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MatchEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "match_event_id", nullable = false, updatable = false)
	private UUID matchEventId;

	@Column(name = "minute", nullable = false, updatable = false)
	private Integer minute;

	@Enumerated(EnumType.STRING)
	@Column(name = "event_type", nullable = false, updatable = false)
	private MatchEventType eventType;

	@ManyToOne
	@JoinColumn(name = "player", nullable = false)
	private Player player;

	@ManyToOne
	@JoinColumn(name = "match", nullable = false, updatable = false)
	private Match match;
}
