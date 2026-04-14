/*
 * Admin.java
 *
 * Defines and works with basic information about admin.
 */
package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "ADMIN")
@NoArgsConstructor
@SuperBuilder
public class Admin extends User {}
