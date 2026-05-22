/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Organizer.java
 *
 * Defines basic information about organizers.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "Organizer")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Organizer extends User {
    private Admin grantedBy;
}
