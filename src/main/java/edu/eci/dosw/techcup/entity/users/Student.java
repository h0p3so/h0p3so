package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.StudentProgram;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Student extends User {
	@Column(name = "semester")
	private Integer semester;

	@Column(name = "eci_id", unique = true, nullable = false)
	private Integer eciID;

	@Enumerated(EnumType.STRING)
	@Column(name = "program", nullable = false)
	private StudentProgram program;

	@OneToMany(mappedBy = "student")
	private List<FamilyRelationship> familyMembers;
}