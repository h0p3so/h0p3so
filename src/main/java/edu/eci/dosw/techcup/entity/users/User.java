package edu.eci.dosw.techcup.entity.users;

import edu.eci.dosw.techcup.enums.UserRole;
import edu.eci.dosw.techcup.enums.UserGender;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "userId")
	private UUID userId;

	@Builder.Default
	@Column(name = "role", nullable = false)
	private UserRole role = UserRole.PLAYER;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "fullname", nullable = false)
	private String fullname;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "gender", nullable = false)
	private UserGender gender;

	@Column(name = "creation_date", nullable = false)
	private LocalDate profileCreatedAt;

	@Column(name = "pp_url")
	private String profilePictureURL;

	@Column(name = "social_1_url")
	private String socialOneURL;

	@Column(name = "social_2_url")
	private String socialTwoURL;

	@Column(name = "social_3_url")
	private String socialThreeURL;

	@Column(name = "birthday")
	private LocalDate birthday;
}
