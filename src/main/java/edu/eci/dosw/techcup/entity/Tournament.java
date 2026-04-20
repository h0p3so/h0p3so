/*
 *                     .___.
 *  o__        o__     |   |\
 * /|          /\      |   |X\
 * / > o        <\     |   |XX\
 *
 * Tournament.java
 *
 * Defines basic information about admins.
 */
package edu.eci.dosw.techcup.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Admin")
@NoArgsConstructor
@Getter
@Setter
public class Admin extends User {}
