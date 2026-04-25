/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Invitation.java
 *
 * Defines basic information about invitations.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.Team;
import edu.eci.dosw.techcup.entity.users.User;
import edu.eci.dosw.techcup.enums.InvitationStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.time.LocalDate;

@Entity
@Table(name = "invitation")
@NoArgsConstructor
@Getter
@Setter
public class Invitation {
	private UUID             id;
	private Team             team;
	private User             user;
	private InvitationStatus status;
	private LocalDate        sendAt;
}
