/*
 * Player.java
 *
 * Defines and works with basic information about players.
 */
package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.PlayerPosition;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "PLAYER")
@NoArgsConstructor
@SuperBuilder
public class Player extends User {
	private Integer        dorsalNumber;
	private PlayerPosition position;
}
