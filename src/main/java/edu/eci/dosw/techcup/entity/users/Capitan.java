package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Entity
@Table(name = "capitans")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Capitan extends User {
	@Column(name = "capitan_since")
	private LocalDate capitanSince;
	@ManyToOne
	@JoinColumn(name = "granted_by")
	private Admin grantedBy;
}