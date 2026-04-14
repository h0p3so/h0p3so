package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.users.Organizer;
import edu.eci.dosw.techcup.enums.TournamentStatus;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TEAM")
@NoArgsConstructor
public class Team {
	private UUID          teamId;
	private String        name;
	private String        logoUrl;
	private Integer       primaryColorRGB;
	private Integer       secondaryColorRGB;
	private PaymentStatus paymentStatus;
	private String        paymenteProofURL;
}
