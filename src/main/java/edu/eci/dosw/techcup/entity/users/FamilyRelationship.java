package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.FamiliarRelationship;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "family_relationships")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FamilyRelationship {
	@EmbeddedId
	private FamilyRelationshipId familyRelationshipId;

	@ManyToOne
	@MapsId("studentId")
	@JoinColumn(name = "student_id")
	private Student student;

	@ManyToOne
	@MapsId("familiarId")
	@JoinColumn(name = "familiar_id")
	private FamilyMember familiar;

	@Enumerated(EnumType.STRING)
	@Column(name = "familiar_kind")
	private FamiliarRelationship relationshipKind;
}
