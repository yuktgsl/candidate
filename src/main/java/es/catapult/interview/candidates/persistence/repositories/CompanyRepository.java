package es.catapult.interview.candidates.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.catapult.interview.candidates.persistence.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
