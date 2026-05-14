/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Graduate.java
 *
 * Defines basic information about graduated students.
 */
package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.StudentProgram;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Graduate")
@NoArgsConstructor
@Getter
@Setter
public class Graduate extends User {
    private Integer        graduationYear;
    private StudentProgram program;
}
