/*
 * Organizer.java
 *
 * Defines and works with basic information about organizers.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "ORGANIZER")
@NoArgsConstructor
@SuperBuilder
public class Organizer extends User {}
