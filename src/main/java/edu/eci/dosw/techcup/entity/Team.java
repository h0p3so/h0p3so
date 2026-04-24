/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Team.java
 *
 * Defines basic information about teams.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.users.Capitan;
import edu.eci.dosw.techcup.entity.Tournament;
import edu.eci.dosw.techcup.entity.TeamMember;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.util.List;
import java.time.LocalDateTime;

@Entity
@Table(name = "Team")
@NoArgsConstructor
@Getter
@Setter
public class Team {
	private UUID             id;
	private String           name;
	private Integer          color1RGB;
	private Integer          color2RGB;
	private String           logoURL;
	private String           backgroundImageURL;
	private LocalDateTime    creationDate;
	private Capitan          createdBy;
	private List<Tournament> participatedIn;
	private List<TeamMember> members;
}
