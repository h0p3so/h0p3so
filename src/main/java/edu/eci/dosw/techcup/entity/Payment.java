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

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
public class Payment {
	private UUID          id;
	private Capitan       uplodadBy;
	private Tournament    tournament;
	private PaymentStatus status;
	private LocalDateTime uploadedAt;
}
