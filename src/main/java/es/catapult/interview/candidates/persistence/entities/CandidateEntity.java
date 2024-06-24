package es.catapult.interview.candidates.persistence.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "candidate", schema = "candidates", // 
indexes = { //
		@Index(name = "name_uniq_idx", columnList = "name", unique = true), //
		@Index(name = "user_name_uniq_idx", columnList = "user_name", unique = true), // 
		@Index(name = "email_name_uniq_idx", columnList = "email_address", unique = true), //
})
public class CandidateEntity {

	@Id
	@Column(name = "user_id", nullable = false, unique = true)
	private Long userId;

	@Column(name = "name", nullable = false, length = 255, unique = true)
	private String name;

	@Column(name = "user_name", nullable = false, length = 255, unique = true)
	private String username;

	@Column(name = "email_address", nullable = false, length = 255, unique = true)
	private String email;

	@Column(name = "phone_number", length = 50)
	private String phone;

	@Column(name = "website_url", length = 255)
	private String website;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private AddressEntity address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="user_id")
	private CompanyEntity company;


}
