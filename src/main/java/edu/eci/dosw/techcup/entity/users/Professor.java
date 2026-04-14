/*
 * Professor.java
 *
 * Defines and works with basic information about professors.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "PROFESSOR")
@NoArgsConstructor
@SuperBuilder
public class Professor extends Player {}
