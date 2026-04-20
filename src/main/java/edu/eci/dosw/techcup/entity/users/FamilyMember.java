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

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import edu.eci.dosw.techcup.enums.FamiliarRelationship;

@Entity
@Table(name = "FamilyMember")
@NoArgsConstructor
@Getter
@Setter
public class FamilyMember extends User {
	private Student              familiarOf;
	private FamiliarRelationship relationship;
}
