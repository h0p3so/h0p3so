/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Payment.java
 *
 * Defines basic information about payments.
 */
package edu.eci.dosw.techcup.entity;

import edu.eci.dosw.techcup.entity.users.Capitan;
import edu.eci.dosw.techcup.entity.Tournament;
import edu.eci.dosw.techcup.enums.PaymentStatus;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	private Capitan uplodadBy;
	private Tournament tournament;
	private PaymentStatus status;
	private LocalDateTime uploadedAt;
}
