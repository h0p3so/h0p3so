/*
 * Referee.java
 *
 * Defines and works with basic information about referees.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "REFEREE")
@NoArgsConstructor
@SuperBuilder
public class Referee extends User {}
