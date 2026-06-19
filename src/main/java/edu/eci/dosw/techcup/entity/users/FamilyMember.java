package edu.eci.dosw.techcup.entity.users;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name = "family_members")
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class FamilyMember extends Player {
	@OneToMany(mappedBy = "familiar")
	private List<FamilyStudent> familyStudents;
}