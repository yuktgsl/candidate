package es.catapult.interview.candidates.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "company", schema = "candidates")
public class CompanyEntity {

	@Id
	@Column(name = "user_id", nullable = false, unique = true)
	private Long userId;

	@Column(name = "name", nullable = false, length = 255)
	private String name;

	@Column(name = "catch_phrase", nullable = false, length = 255)
	private String catchPhrase;

	@Column(name = "bs", nullable = false, length = 255)
	private String bs;

}