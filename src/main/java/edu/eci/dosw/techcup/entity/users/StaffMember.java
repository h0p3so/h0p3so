/*
 * StaffMember.java
 *
 * Defines and works with basic information about staff member.
 */
package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.Program;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "STAFF_MEMBER")
@NoArgsConstructor
@SuperBuilder
public class StaffMember extends Player {}
