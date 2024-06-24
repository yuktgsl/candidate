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
@Table(name = "geo", schema = "candidates")
public class GeoEntity {

	@Id
	@Column(name = "user_id", nullable = false, unique = true)
	private Long userId;

	private String lat;
	private String lng;
}
