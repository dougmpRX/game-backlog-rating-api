package com.dmpweb.gamebacklogratingapi.repositories;

import com.dmpweb.gamebacklogratingapi.entities.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
