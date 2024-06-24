package es.catapult.interview.candidates.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.catapult.interview.candidates.persistence.entities.CandidateEntity;

public interface CandidateRepository extends JpaRepository<CandidateEntity, Long> {
}
