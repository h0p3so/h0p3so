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

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "fields")
@NoArgsConstructor
@Getter
@Setter
public class Field {
	private UUID   id;
	private String description;
	private String photoURL;
}
