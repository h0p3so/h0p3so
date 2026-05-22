/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Field.java
 *
 * Defines basic information about fields.
 */
package edu.eci.dosw.techcup.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "fields")
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Field {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	private String description;
	private String photoURL;
}
