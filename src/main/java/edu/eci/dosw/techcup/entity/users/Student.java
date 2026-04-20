/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Student.java
 *
 * Defines basic information about current students at ECI.
 */
package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.StudentProgram;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@Getter
@Setter
public class Student extends User {
    private Integer        semester;
    private Integer        eciID;
    private StudentProgram program;
}
