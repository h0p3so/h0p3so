/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 * User.java
 *
 * Defines a basic structure with which all users can be model.
 */
package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.UserRole;
import edu.eci.dosw.techcup.enums.UserGender;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "User")
@NoArgsConstructor
@Getter
@Setter
public abstract class User {
	private UUID          id;
	private String        email;
	private String        fullname;
	private String        password;
	private UserRole      role;
	private String        profilePictureURL;
	private String        socialOneURL;
	private String        socialTwoURL;
	private String        socialThreeURL;
	private UserGender    gender;
	private LocalDateTime birthday;
	private LocalDateTime profileCreatedAt;
}
