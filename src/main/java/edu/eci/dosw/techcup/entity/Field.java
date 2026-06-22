package edu.eci.dosw.techcup.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "fields")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Field {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "field_id")
	private UUID fieldId;

	@Column(name = "description")
	private String description;

	@Column(name = "photo_url")
	private String photoURL;

	@Column(name = "matched_played")
	private Integer matchesPlayed;
}
