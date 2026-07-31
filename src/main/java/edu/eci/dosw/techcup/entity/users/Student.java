package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.StudentProgram;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Check;
import java.util.List;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Check(constraints = """
	semester >= 0 AND
	eci_id   >= 1000000000000
""")
public class Student extends Player {
	@Column(name = "semester", nullable = false)
	private Integer semester;

	@Column(name = "eci_id", unique = true, nullable = false)
	private Long eciID;

	@Enumerated(EnumType.STRING)
	@Column(name = "program", nullable = false)
	private StudentProgram program;

	@OneToMany(mappedBy = "student")
	private List<FamilyStudent> familyMembers;
}