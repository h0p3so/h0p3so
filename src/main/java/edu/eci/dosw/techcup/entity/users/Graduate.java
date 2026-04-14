/*
 * Graduate.java
 *
 * Defines and works with basic information about graduated students.
 */
package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.Program;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "GRADUATE")
@NoArgsConstructor
@SuperBuilder
public class Graduate extends Player {}
