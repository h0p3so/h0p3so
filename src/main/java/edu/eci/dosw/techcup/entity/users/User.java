/*
 * User.java
 *
 * Defines a basic structure for the creation of a simple user. All other classes
 * with names associated to a role are just a tiny extension from this class.
 */
package edu.eci.dosw.techcup.entity.users;

import java.util.UUID;

import edu.eci.dosw.techcup.enums.UserRole;
import edu.eci.dosw.techcup.enums.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "USER")
@NoArgsConstructor
@SuperBuilder
public abstract class User {
	private UUID     usrId;
	private String   email;
	private String   fullname;
	private String   password;
	private String   photoUrl;
	private UserRole role;
	private Gender   gender;
	private boolean  available;
}
