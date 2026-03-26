package edu.eci.dosw.techcup.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;
import org.hibernate.annotations.Check;

@Entity
@Table(name = "fields")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Check(constraints = """
	matched_played >= 0
""")
public class Field {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "field_id")
	private UUID fieldId;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "description", length = 1024)
	private String description;

	@Column(name = "photo_url")
	private String photoURL;

	@Column(name = "matched_played")
	private Integer matchesPlayed;

	@OneToMany
	private List<Match> matches;

	@PrePersist
	public void beforeInsert () {
		this.matchesPlayed = 0;
	}
}
