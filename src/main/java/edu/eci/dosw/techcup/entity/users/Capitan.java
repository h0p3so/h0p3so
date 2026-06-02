/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Capitan.java
 *
 * Defines basic information about capitans.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "Capitan")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Capitan extends User {
	private LocalDate capitanSince;
	@ManyToOne
	@JoinColumn(name = "adminId")
	private Admin grantedBy;
}
