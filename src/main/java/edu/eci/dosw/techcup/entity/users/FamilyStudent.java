package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.FamiliarRelationship;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "family_students")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FamilyStudent {
	@EmbeddedId
	private FamilyStudentId familyStudentId;

	@Enumerated(EnumType.STRING)
	@Column(name = "familiar_kind", nullable = false)
	private FamiliarRelationship relationshipKind;

	@ManyToOne
	@MapsId("studentId")
	@JoinColumn(name = "student_id", nullable = false)
	private Student student;

	@ManyToOne
	@MapsId("familiarId")
	@JoinColumn(name = "familiar_id", nullable = false)
	private FamilyMember familiar;
}
