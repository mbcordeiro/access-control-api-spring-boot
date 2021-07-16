package com.matheuscordeiro.accesscontrolapi.repositories;

import com.matheuscordeiro.accesscontrolapi.models.JourneyWork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyWorkRepository extends JpaRepository<JourneyWork, Long> {
}
