/*
 * FamilyMember.java
 *
 * Defines and works with basic information about family members.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "FAMILY_MEMBER")
@NoArgsConstructor
@SuperBuilder
public class FamilyMember extends Player {}
