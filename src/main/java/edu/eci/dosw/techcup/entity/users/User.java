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

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "User")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Builder.Default
	private UserRole role = UserRole.PLAYER;

	private String email;
	private String fullname;
	private String password;

	private String profilePictureURL;
	private String socialOneURL;
	private String socialTwoURL;
	private String socialThreeURL;
	private UserGender gender;
	private LocalDate birthday;
	private LocalDate profileCreatedAt;
}
