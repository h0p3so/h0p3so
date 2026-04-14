/*
 * Student.java
 *
 * Defines and works with basic information about students.
 */
package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.Program;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "STUDENT")
@NoArgsConstructor
@SuperBuilder
public class Student extends Player {
	private Integer semester;
	private Integer dorsalNumber;
	private Integer eciID;
	private Program program;
}
