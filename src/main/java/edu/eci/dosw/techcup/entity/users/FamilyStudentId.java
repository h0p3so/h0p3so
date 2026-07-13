package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FamilyStudentId implements Serializable {
	@Column(name = "student_id")
	private UUID studentId;

	@Column(name = "familiar_id")
	private UUID familiarId;

	@Override
	public int hashCode () {
		return Objects.hash(this.studentId, this.familiarId);
	}

	@Override
	public boolean equals (final Object o) {
		if (this == o) {
			return true;
		}
		if ((o instanceof FamilyStudentId) == false) {
			return false;
		}

		final FamilyStudentId other = (FamilyStudentId) o;
		return Objects.equals(other.getFamiliarId(), this.familiarId) && Objects.equals(other.getStudentId(), this.studentId);
	}
}
