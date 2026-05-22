/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * TeamMember.java
 *
 * The difference between a team member and a user is that, a user is the pure
 * person, all the information about them, wheras the team member is when a user
 * actually enrolls in a team.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.Team;
import edu.eci.dosw.techcup.entity.users.User;
import edu.eci.dosw.techcup.enums.PlayerPosition;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.util.List;
import java.time.LocalDate;

@Entity
@Table(name = "TeamMember")
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeamMember {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID           id;
	private User           user;
	private Integer        dorsalNumber;
	private PlayerPosition position;
	private LocalDate      joinedOn;
	private List<Team>     havePlayedIn;
}
