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

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Capitan")
@NoArgsConstructor
@Getter
@Setter
public class Capitan extends User {
	private LocalDateTime capitanSince;
	private Admin         grantedBy;
}
