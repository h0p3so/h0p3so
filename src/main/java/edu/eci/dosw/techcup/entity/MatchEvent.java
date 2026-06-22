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
	private UUID matchEventId;

	@Column(name = "minute", nullable = false)
	private Integer minute;

	@Enumerated(EnumType.STRING)
	@Column(name = "event_type", nullable = false)
	private MatchEventType eventType;

	@OneToOne
	private Player player;

	@ManyToOne
	@JoinColumn(name = "match")
	private Match match;
}
