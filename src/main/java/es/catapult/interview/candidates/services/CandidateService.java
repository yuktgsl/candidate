package es.catapult.interview.candidates.services;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.stereotype.Service;

import es.catapult.interview.candidates.feign.PlaceholderUserDao;
import es.catapult.interview.candidates.feign.PlaceholderUsersApi;
import es.catapult.interview.candidates.model.UserDao;
import es.catapult.interview.candidates.persistence.entities.CandidateEntity;
import es.catapult.interview.candidates.persistence.repositories.CandidateRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class CandidateService {

	private final CandidateRepository candidateRepository;
	private final PlaceholderUsersApi placeholderUsersApi;

	public List<UserDao> getAll() {
		log.debug("getting all users");

		return candidateRepository.findAll().stream() //
				.map(e -> toDtoFromEntity.apply(e)) //
				.toList(); //
	}

	public UserDao get(long userId) {
		log.debug("getting users [{}]", userId);

		Optional<CandidateEntity> candidateEntityOptional = candidateRepository.findById(userId);
		UserDao userDao;
		if (candidateEntityOptional.isPresent()) {
			userDao = toDtoFromEntity.apply(candidateEntityOptional.get());
		} else {
			userDao = toDtoFromPlaceHolderUserDao.apply(placeholderUsersApi.get(userId));
		}
		return userDao;
	}

	
	public Function<CandidateEntity, UserDao> toDtoFromEntity = //
			entity -> UserDao.builder() //
					.addressCity(entity.getAddress().getCity()) //
					.addressStreet(entity.getAddress().getStreet()) //
					.addressSuite(entity.getAddress().getSuite()) //
					.addressZipCode(entity.getAddress().getZipcode()) //
					.email(entity.getEmail()) //
					.name(entity.getName()) //
					.phone(entity.getPhone()) //
					.userId(entity.getUserId()) //
					.username(entity.getUsername()) //
					.website(entity.getWebsite()) //
					.build();

	public Function<PlaceholderUserDao, UserDao> toDtoFromPlaceHolderUserDao = //
			entity -> UserDao.builder() //
					.addressCity(entity.address().city()) //
					.addressStreet(entity.address().street()) //
					.addressSuite(entity.address().suite()) //
					.addressZipCode(entity.address().zipcode()) //
					.email(entity.name()) //
					.name(entity.name()) //
					.phone(entity.phone()) //
					.userId(entity.id()) //
					.username(entity.username()) //
					.website(entity.website()) //
					.build();
}