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

import jakarta.annotation.Nullable;
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
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID userId;

	@Builder.Default
	@Column(nullable = false)
	private UserRole role = UserRole.PLAYER;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String fullname;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false)
	private UserGender gender;

	@Column(nullable = false)
	private LocalDate profileCreatedAt;

	private String profilePictureURL;
	private String socialOneURL;
	private String socialTwoURL;
	private String socialThreeURL;
	private LocalDate birthday;
}
