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
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "Student")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Student extends User {
    @ManyToMany(mappedBy = "familiarOf")
    private List<FamilyMember> familiars;
    private Integer semester;
    private Integer eciID;
    private StudentProgram program;
}
