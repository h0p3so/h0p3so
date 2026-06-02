/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * FamilyMember.java
 *
 * Defines basic information about family members.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import edu.eci.dosw.techcup.enums.FamiliarRelationship;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "FamilyMember")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class FamilyMember extends User {
	private List<Student> familiarOf;
	private FamiliarRelationship relationship;
}
