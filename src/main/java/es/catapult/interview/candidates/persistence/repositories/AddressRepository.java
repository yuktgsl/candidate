package es.catapult.interview.candidates.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.catapult.interview.candidates.persistence.entities.AddressEntity;

public interface AddressRepository extends JpaRepository<AddressEntity, Long> {
}
