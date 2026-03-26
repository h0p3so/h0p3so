package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.StudentProgram;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "graduates")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Graduate extends Player {
	@Column(name = "graduation_year")
	private Integer graduationYear;

	@Enumerated(EnumType.STRING)
	@Column(name = "program")
	private StudentProgram program;
}