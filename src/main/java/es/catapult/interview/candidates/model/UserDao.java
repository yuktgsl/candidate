package es.catapult.interview.candidates.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDao {

	private Long userId;
	private String name;
	private String username;
	private String email;
	private String phone;
	private String website;

	private String addressStreet;
	private String addressSuite;
	private String addressCity;
	private String addressZipCode;
}
