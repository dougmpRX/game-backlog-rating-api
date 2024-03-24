package com.dmpweb.gamebacklogratingapi.repositories;

import com.dmpweb.gamebacklogratingapi.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
