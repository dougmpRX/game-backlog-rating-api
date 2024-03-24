package com.dmpweb.gamebacklogratingapi.repositories;

import com.dmpweb.gamebacklogratingapi.entities.Platform;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformRepository extends JpaRepository<Platform, Long> {
}
