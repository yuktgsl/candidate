package es.catapult.interview.candidates.persistence.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "address", schema = "candidates")
public class AddressEntity {

	@Id
	@Column(name = "user_id", nullable = false, unique = true)
	private Long userId;

	@Column(name = "street", nullable = false, length = 255)
	private String street;

	@Column(name = "suite", length = 255, unique = true)
	private String suite;

	@Column(name = "city", length = 255, unique = true)
	private String city;

	@Column(name = "zipcode", nullable = false, length = 255, unique = true)
	private String zipcode;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private GeoEntity geo;

}
